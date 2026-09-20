fun main(){
    print("Enter marks: ")
    val marks = readln().toInt()
    if (marks in 91..100){
        println("Grade A")
    }else if (marks in 81..90){
        println("Grade B")
    }else if(marks in 71..80){
        println("Grade C")
    }else{
        println("F")
    }


}