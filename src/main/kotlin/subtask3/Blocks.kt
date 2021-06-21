package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class -> {
                return blockA.filterIsInstance<String>().joinToString("")
            }
            Int::class -> {
                val list = blockA.filterIsInstance<Int>()
                return list.sum()
            }
            LocalDate::class -> {
                return blockA.filterIsInstance<LocalDate>().max()!!
                    .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
        }
        return blockA
    }

}
