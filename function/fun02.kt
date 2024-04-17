package function

fun max(a:Int, b:Int) = if(a>b) a else b

fun main(){
    print("정수1 입력 >> ")
    var num1 = readln().toInt()

    print("정수2 입력 >> ")
    var num2 = readln().toInt()

    println("$num1 과 $num2 중 더 큰 수 = ${max(num1,num2)}")

    println()
}