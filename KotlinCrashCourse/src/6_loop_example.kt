fun main(){
    var num = 10

    println("______while loop _______")
    while (num>0){
        println(num)
        num--
    }
    println("______do while loop _______")
    do {
        println(num)
        num--
    }while (num>10)

    println("______for loop with step _______")

    for(i in 0..10 step 2 ){
        println(i)
    }

    println("______for loop with using until last one is exclude _______")
    for (i in 1 until 10){
        println(i)
    }

    println("______loop in array_______")

    val nums : Array<Int> = arrayOf(1,2,3,4,5,6,7)

    for(num in nums){
        println(num)
    }
}