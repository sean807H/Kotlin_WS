package exam/*fun main(){
    for(i in 1..10 step 2){
        println(i)
    }
    for(i in 10 downTo 0 step 2){
        println(i)
    }
}*/

/*fun main(){
    print("숫자를 입력하세요 : ")
    var num = readln().toInt()
    var sum : Int = 0
    for(i in 0..num step 2){
        sum += i
        println("$sum")
    }
}*/

fun main(){
    print("숫자 입력 : ")
    var num = readln().toInt()
    for(i in num downTo 1 step 1){
        println(i)
    }
}