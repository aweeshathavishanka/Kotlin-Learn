fun calculateGrade(mark: Int): String {
    return when {
        mark in 75..100 -> "A"
        mark in 65..74 -> "B"
        mark in 50..64 -> "C"
        mark in 35..49 -> "D"
        mark in 0..34 -> "F"
        else -> "Invalid mark"
    }
}

fun main() {
    val marks = listOf(85, 70, 55, 40, 20, -5, 105)

    for (mark in marks) {
        val grade = calculateGrade(mark)
        println("Mark: $mark - Grade: $grade")
    }
}
