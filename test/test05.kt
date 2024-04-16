package test

fun main(){
    val ch = 'a'
    println(ch+1)

    val kor = '\uD55C'
    println(kor)

    val code: Int = 65

    // code에 해당하는 문자를 할당
    val chFromCode: Char = code.toChar()
    println(chFromCode)
}