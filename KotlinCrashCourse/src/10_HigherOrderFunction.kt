fun sumTwoNumber(num1:Int, num2: Int, callback:()-> Unit){
    println("Sum of two numbers is ${num1+num2}")
    callback()
}

fun cube(num: Int, callback: (message: String) -> Unit){
    println("Cube is ${num*num*num}")
    callback("cube calculated")
}

fun main(){
    val callBackFuncion = {
        println("sum completed")
    }

    sumTwoNumber(23,423,callBackFuncion)

    cube(3){ println(it)}
}