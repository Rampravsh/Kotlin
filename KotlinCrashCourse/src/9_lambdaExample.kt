fun main (){

    val square = {x: Int ->x*x }
    val addition ={x:Int, y:Int ->x+y}
    val myVar = {
        println("hi i am lambda")
    }
    myVar()

    println(square(5))
    println(addition(35, 34))
}

