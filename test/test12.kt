package test//fun main(){
//    val a:Any = 10
//    val b = a as Int
//    print("${a+10}")
//}

fun main(){
    val a:Any = "10"        //Any 타입은 +연산자 안됨. 뎃셈 가능한 정확한 타입 필요
    val b = a as? Int       //int 형변환 실패 null 리턴
                            //as 연산자(변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자 (데이터 타입 캐스트 실패시 예외 발생)
                            //safe cast 연산자 as?는 캐스트가 실패해도 예외를 발생시키지 않고, null을 돌려줌으로써 안전하게 타입 캐스트를 다룰수 있게함
    if(b!=null) println("${b+10}")
    else println(b)
}