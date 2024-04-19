package function

fun funSales(price:Int, grade:String="4") : Int{
    var result:Int = (price*0.95).toInt()
    when(grade){
        "1" -> {
            println("Silver 10% 할인")
            result = (price * 0.90).toInt()
        }
        "2" -> {
            println("Gold 20% 할인")
            result = (price * 0.80).toInt()
        }
        "3" -> {
            println("VIP 30% 할인")
            result = (price * 0.70).toInt()
        }
        else -> println("(S,G,V)등급 이외는 기본등급으로 5%로 할인입니다")
    }
    return result
}

fun main() {
    print("구매 금액 입력 >> ")
    var price = readln().toInt()
    print("등급 입력 (1)S=실버, (2)G=골드, (3)V=VIP, (4)일반 >> ")
    var grade:String = readln()
    println("할인된 가격=${funSales(price,grade)}")

}