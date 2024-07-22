fun main(){
    //Operators

    val a=5
    val b=3

    //Arithmatic Operator
    val sum=a+b //Summation
    val sub=a-b //Substraction
    val mul=a *b //Multiplication
    val div=a / b.toFloat() //Division

    //Comparison Operators
    val val1=a>b
    val val2=a==b
    val val3=a!=b

    //Logical Operators
    val t=true
    val f=false

    val val4=t&&f //AND Operator
    val val5=t||f //OR Operator
    val val6=!t //NOT Operator

    println("sum: $sum")
    println("sub: $sub")
    println("mul: $mul")
    println("div: $div")
    println("a > b: $val1")
    println("a == b: $val2")
    println("a != b: $val3")
    println("t && f: $val4")
    println("t || f: $val5")
    println("!t: $val6")

}