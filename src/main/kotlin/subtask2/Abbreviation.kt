package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val filtered = a.toUpperCase().filter { b.contains(it) }
        return if (filtered == b) {
            "YES"
        } else "NO"
    }


}
