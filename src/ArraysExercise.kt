fun calculateCircumference(radius: Double): Double {
    val pi = 3.141592653589793
    return 2 * pi * radius
}

fun main() {
    val radius = 5.0
    val circumference = calculateCircumference(radius)
    println("The circumference of a circle with radius $radius is $circumference")
}