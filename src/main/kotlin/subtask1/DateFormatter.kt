package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("Ru"))
            date.format(formatter)
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
