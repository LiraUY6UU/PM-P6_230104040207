package id.antasari.pm6_minda_230104040207.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "diary_entries")
data class DiaryEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val content: String,
    val mood: String, // Emoji: 😀, 😢, etc.
    val timestamp: Long
)