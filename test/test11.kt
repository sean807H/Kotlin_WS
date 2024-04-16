package test

fun whichType(data:Any){
    // 타입이 맞으면 String 형으로 스마트 변환되어 length를 사용하게 됨
    if(data is String) println("$data 는 String입니다. $data 의 길이=${data.length}")
    else if(data is Int) println("$data 는 Int입니다. $data 의 2배=${data+2}")
    else println("$data 는 String도 Int도 아닙니다. ${data.javaClass}형입니다.")
}
fun main(){
    whichType("ABCDEF")
    whichType(123)
    whichType(3.14)
    whichType(true)
}
