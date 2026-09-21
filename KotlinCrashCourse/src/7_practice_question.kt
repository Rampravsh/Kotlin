


fun main(){
    println("Enter a number")
    val inputNum = readln().toInt()

    countDigit(inputNum)
    reverseNumber(inputNum)

}

// WAP to take a number from user and count the digit.

fun countDigit(number: Int){
//    var number= number
//    var totalDigit = 0
//    while (number!=0){
//        totalDigit++
//        number=(number/10).toInt()
//    }
//    println(totalDigit)

    println(number.toString().length)
}

// WAP to take number from user and reverse.

fun reverseNumber (num: Int){
    var num: Int = num
    var reverseNum: Int= 0

    while(num > 0){
        var lastDigit = num%10
        reverseNum = reverseNum*10+lastDigit
        num = (num/10).toInt()
    }
    println(reverseNum)
}
