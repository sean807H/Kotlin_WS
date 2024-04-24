package function

fun main(){
    val res1 = sum9(3,2)
    val res2 = mul(sum9(3,3),3)      // 인자에 함수를 사용
    println("res1=$res1, res=$res2")
    println("func:${func()}")

}

fun sum9(a:Int, b:Int) = a+b
fun mul(a:Int, b:Int) = a*b

fun func():Int{
    return sum9(2,2)                     // 함수의 반환값으로 함수 사용
}