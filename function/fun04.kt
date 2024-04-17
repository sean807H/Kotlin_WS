package function

// 매개변수에 디폴트 값을 설정하기, 매개변수가 없을 때 디폴트 값 저장
fun sayHello2(name: String = "Korea"){
    println("Hello!! "+name)
}

// 명명된 인자: 함수를 호출할 떄 매개변수의 순서와 상관없이 인자 전달 가능
fun sayHello3(no: Int, name: String = "Korea"){         // 일반 매개변수를 앞쪽에 먼저 정의
    println("Hello!! "+name)
}

fun main(){
    sayHello2()
    sayHello2("Kim")
    sayHello3(5)
    sayHello3(no=10)
    sayHello3(no=10, name="Kim")
}