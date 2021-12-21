package kotlincase

import java.text.SimpleDateFormat
import java.util.*

object CaseStudy01 {
    //Case 1: Convert Format Date
    fun getDateConvert(oldFormat: String, oldDate: String, newFormat: String): String {
        val sdf = SimpleDateFormat(oldFormat, Locale.getDefault())
        val sdf2 = SimpleDateFormat(newFormat, Locale("id","ID"))
        val date = sdf.parse(oldDate)
        return sdf2.format(date)
    }
}