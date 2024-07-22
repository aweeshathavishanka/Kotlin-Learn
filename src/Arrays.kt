


fun main(){
    var appleProducts = arrayOf(
        "iPhone",
        "iPad",
        "MacBook",
        "Apple Watch",
        "AirPods",
        "iMac",
        "Apple TV",
        "HomePod",
        "Mac Mini",
        "Mac Pro"
    )

    //size of the Array
    println("Size of the array is ${appleProducts.size}")
    println("***************************")
    println(appleProducts[0])
    println("***************************")

    //Change on Array Element
    appleProducts [1] = "Awee's ipad"

    //for looping through the array
    for (i in appleProducts){
        println(i)
    }

        //Exercise
        //1. Create an array that contains the module names, that you’ll learn in this semester.
        var sliitModules = arrayOf(
            "Software Engineering",
            "Database Systems",
            "Data Structures and Algorithms",
            "Computer Networks",
            "Operating Systems",
            "Object-Oriented Programming",
            "Web Development",
            "Mathematics for Computing"
        )

    println("_________________________________________________________________________")
    println("Size of the array is ${sliitModules.size}")
    println("***************************")
    println(sliitModules[0])
    println("***************************")

    // Print all SLIIT second year second sem modules
        for (module in sliitModules) {
            println(module)
        }

    //Using the arrayOf function:
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val names = arrayOf("Alice", "Bob", "Charlie")

    for (index in numbers){
        println(index)
    }

    for (value in names){
        println(value)
    }

    //Using the Array constructor:
    val squares = Array(5) { i -> (i * i) }

    for (squareValue in squares){
        println(squareValue)
    }

    //Primitive type arrays:
    /*Kotlin provides specialized classes for arrays of primitive types to avoid the
     overhead of boxing: IntArray, DoubleArray, CharArray, etc.
     */

    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    for  (int in intArray){
        println(intArray)
    }

    for (double in doubleArray){
        println(double)
    }

    //Accessing Elements
    /*Elements in an array are accessed using the index, starting from 0:

     */
    val number = arrayOf(1, 2, 3, 4, 5)
    println(number[0]) // Prints 1
    println(number[3]) // Prints 4


    //Modifying Elements
    val numberModify = arrayOf(1, 2, 3, 4, 5)
    numberModify[2] = 10
    println(numberModify[2]) // Prints 10



    //Looping through Arrays
        //Using for loop:
    val namesLoop = arrayOf("Alice", "Bob", "Charlie")
    for (name in namesLoop) {
        println(name)
    }

        //Using indices:

    val nameIndices = arrayOf("Alice", "Bob", "Charlie")
    for (i in nameIndices.indices) {
        println("Element at index $i is ${names[i]}")
    }

        //Using forEach:
    val nameForEach = arrayOf("Alice", "Bob", "Charlie")
    nameForEach.forEach { name ->
        println(name)
    }



    //Array Properties and Methods
    /*Arrays in Kotlin have several useful properties and methods:

     */
        //Size - Returns the number of elements in the array.
    val numberSize = arrayOf(1, 2, 3, 4, 5)
    println(numberSize.size) // Prints 5

        //isEmpty: Checks if the array is empty.
    val emptyArray = arrayOf<Int>()
    println(emptyArray.isEmpty()) // Prints true

        //first and last: Returns the first and last elements of the array.
    val numberFirstAndLast = arrayOf(1, 2, 3, 4, 5)
    println(numberFirstAndLast.first()) // Prints 1
    println(numberFirstAndLast.last()) // Prints 5

        //contains: Checks if the array contains a specific element.
    val numberContains = arrayOf(1, 2, 3, 4, 5)
    println(numberContains.contains(3)) // Prints true





}


