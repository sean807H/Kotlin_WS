package function

//fun printInfo(p:()->Unit){
//    println("계산 Version:")
//    p()
//}
//fun main(){
//    printInfo ({ println("1.1") })
//    printInfo (){ println("1.1") }
//    printInfo { println("1.1") }        // 고차함수 호출->소괄호 생략
//}

fun square(a:Int,p:(Int)->(Int)){
    println("$a->${p(a)}")
}
fun main(){
    square(2,{a->a*a})
    square(2){a->a*a}
    square(2){it*it}        // 매개변수가 1개 인경우 it 사용가능
}