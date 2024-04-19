package function

fun sum1(a:Int, b:Int, c:String): Int{
    when(c) {
        "+" -> return a+b
        "-" -> return a-b
        "*" -> return a*b
        "/" -> return a/b
        else -> return 0
    }
}

fun main() {
    print("숫자1 >> ")
    var a = readln().toInt()
    print("숫자2 >> ")
    var b = readln().toInt()
    print("연산자(+,-,*,/) >> ")
    var c = readln()

    println("$a $c $b = ${sum1(a,b,c)}")
}



