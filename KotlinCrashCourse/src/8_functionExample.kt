fun ramu(){
    println("Pani daal diya ")
    println("completed")
}

fun pintu(){
    println("Pintu: I dont have money to buy a samosa")
}

fun sayHello(){
    println("hello how are you")
}

fun pintu(money: Int, saman: String): String{
    return "Take $saman for $money"
}


fun main (){
    ramu()
    pintu()
    sayHello()
    val result =pintu(424,"mango")

    println("result")
}