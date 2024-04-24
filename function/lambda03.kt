package function

fun main(){
    val upperCase1:(String)->String = {str:String -> str.toUpperCase()}
    println(upperCase1("hello"))

    val upperCase2:(String)->String = {str -> str.toUpperCase()}        // 매개변수 자료형 생략
    println(upperCase2("hello"))
    
    val upperCase3 = {str:String -> str.toUpperCase()}                  // 선언 자료형 새략
    println(upperCase3("hello"))

    val upperCase4:(String)->String = {it.toUpperCase()}                // 매개변수 자료형, 매개변수 생략
    println(upperCase4("hello"))
    
    val upperCase5:(String)->String = String::toUpperCase               // 일반 함수호출
    println(upperCase5("hello"))
}