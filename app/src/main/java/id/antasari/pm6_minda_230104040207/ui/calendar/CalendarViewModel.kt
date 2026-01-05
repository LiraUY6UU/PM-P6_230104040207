package id.antasari.pm6_minda_230104040207.ui.calendar

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import id.antasari.pm6_minda_230104040207.data.DiaryEntry
import id.antasari.pm6_minda_230104040207.data.DiaryRepository
import id.antasari.pm6_minda_230104040207.data.MindaDatabase
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId

class CalendarViewModel(private val repository: DiaryRepository) : ViewModel() {

    // Mengelompokkan diary berdasarkan tanggal
    val diaryByDate: StateFlow<Map<LocalDate, List<DiaryEntry>>> = repository.observeAll()
        .map { entries ->
            entries.groupBy { entry ->
                Instant.ofEpochMilli(entry.timestamp)
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate()
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyMap())

    companion object {
        fun provideFactory(application: Application): ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                val db = MindaDatabase.getInstance(application)
                val repo = DiaryRepository(db.diaryDao())
                return CalendarViewModel(repo) as T
            }
        }
    }
}