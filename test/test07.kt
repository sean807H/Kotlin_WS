package test

fun main(){
    var test: Number = 12.2     // 숫자를 다 넣을 수 있는 Number(부모)
    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.0f       // 스마트 캐스트
    println("$test")
}