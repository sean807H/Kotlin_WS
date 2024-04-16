package test

fun main(){
    var a: Any = 1      // Any 최고 클래스
    println("a : $a type is ${a.javaClass}")

    a = 300L
    println("a : $a type is ${a.javaClass}")

    checkType("Today")
    checkType(1234)
    checkType(1234567891234)
    checkType(1234f)
}

fun checkType(x:Any){       // 업 캐스팅
    if(x is String)         // 다운 캐스팅(자동)
        println("x is String : $x")
    else if(x is Int)
        println("x is Int : $x")
    else
        println("x is type : ${x.javaClass}")
}