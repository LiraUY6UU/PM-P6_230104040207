package id.antasari.pm6_minda_230104040207.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun formatTimestamp(ts: Long): String {
    val sdf = SimpleDateFormat("dd MMM, yyyy, hh:mm a", Locale.getDefault())
    return sdf.format(Date(ts))
}