
fun main(){
    print("Enter number: ")
    val number: Int = readln().toInt()
    if (number>0){
        println("$number Number is Positive")
    }else if (number<0){
        println("$number Number is Negative ")
    }else{
        println("number is Zero")
    }
}