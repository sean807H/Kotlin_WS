package function

//fun sumBasic(a:Int, b:Int):Int{
//    return a+b
//}

fun sum(a:Int, b:Int) = a + b

fun main(){
    print("정수1 입력 >> ")
    var num1 = readln().toInt()

    print("정수2 입력 >> ")
    var num2 = readln().toInt()

    println("$num1 + $num2 = ${sum(num1,num2)}")

    var result = sum(1,2)
    println("1 + 2 = $result")
}