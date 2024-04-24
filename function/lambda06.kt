package function

val sumla = {a:Int, b:Int -> a+b}       //람다함수
fun calculator(a:Int,b:Int,operation:(Int,Int)->Int) = operation(a,b)   //고차함수
fun main(){
    println(calculator(2,1,sumla))                      //람다식을 인자로 전달
    println(calculator(2,1,{a:Int, b:Int->a+b}))        //람다식을 인자로 바로전달
    println(calculator(2,1){a:Int,b:Int->a+b})
    println(calculator(2,1){a,b->a+b})
}
