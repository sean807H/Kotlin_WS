package exam

fun main(){
    var num1 = 10
    var num2 = 10
    val result1 = ++num1
    val result2 = num2++

    println("result1:$result1")
    println("result2:$result2")
    println("num1:$num1")
    println("num2:$num2")

    val number1 = 12
    val number2 = 25

    println(number1>20||number2>20)
    println(number1 or number2)

    println(number1 and number2)
    println(number1>20||number2>20)

    println(number1 xor number2)
}
