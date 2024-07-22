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

fun calculateGradesIfs(mark: Int): String {
    return if (mark in 75..100) {
        "A"
    } else if (mark in 65..74) {
        "B"
    } else if (mark in 50..64) {
        "C"
    } else if (mark in 35..49) {
        "D"
    } else if (mark in 0..34) {
        "F"
    } else {
        "Invalid mark"
    }
}

fun main() {
    val marks = listOf(85, 70, 55, 40, 20, -5, 105)

    // Using the when expression
    for (mark in marks) {
        val grade = calculateGrade(mark)
        println("Mark: $mark - Grade: $grade")
    }

    // Using the if-else expression
    for (mark in marks) {
        val grade = calculateGradesIfs(mark)
        println("Mark: $mark - Grade: $grade")
    }
}
