fun main(){
    var num = 10

    while (num>0){
        println(num)
        num--
    }

    do {
        println(num)
        num--
    }while (num>10)

    for(i in 0..100 step 3 ){
        print(i)
    }
}