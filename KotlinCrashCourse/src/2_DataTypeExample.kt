import java.net.InetAddress

class User(
    val name: String,
    val phone: String,
    val address: String
){
    fun printAll(){
        println(name)
        println(phone)
        println(address)
    }
}


fun main(){
    val user1:User =User("ram", "478320478998","patna")

    println(user1.address)
    println(user1.name)
    println(user1.phone)

    user1.printAll()
}
