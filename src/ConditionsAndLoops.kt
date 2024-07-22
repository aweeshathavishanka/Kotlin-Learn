fun main(){
    var age = 5
    if(age < 18){
        println("This person is an adult.")

    }else{
        println("This person is child")
    }

    //When Expression
    var x = 5
    when(x){
        0,1 -> println("x == 0 or x == 1")
        else -> println("x is neither 1 nor 2")
    }

    //For Loop
    for(i in 1..10){
        print("$i ")
    }
    for(j in 0..20 step 5){
        println("$j ")
    }

    for(k in 1 until 10 step 3){
        print("$k ")

    }

    for(l in 1..10){
        if(l==5){
            continue
        }
        print("$l ")
    }

    for(m in 1..10){
        print("$m ")
        if(m==5){
            break
        }

        //While
        var n=0
        while(n<5){
            println(n)
            n++
        }
    }
}