package function

//fun main(){
//    val result:Int
//    result = highOrder({x,y -> x+y}, 10,20)     //고차함수
//    println(result)
//}
//
//fun highOrder(sum:(Int, Int)->Int,a:Int,b:Int):Int{
//    return sum(a,b)
//}

fun a(str:String): String{
    return str
}
// fun 고차함수이름(매개변수:(입력 받을 타입)->리턴타입){ 구현 }
fun b (funs:(String)->String){
    println(funs(" awds "))
}
fun sumc(a:Int,b:Int):Int = a+b
fun calc(a:Int,b:Int,operation:(Int,Int)->Int) = operation(a,b)
fun main(){
    b(::a)                //함수포인터
    println(calc(2,1,::sumc))
}