package array

fun main(){
    val bookName = arrayOf<String>("java","kotlin","c","c#")
    val bookPrice = arrayOf(10000,20000,30000,10000)
    val stuDiscount = 0.2f      // 학생인 경우 20% 할인하여 계산
    val teaDiscount = 0.1f      //교사인 경우 10% 할인하여 계산

    var book:String? =null       // 선택도서
    var result = 0.0f

    println("*** 유원서점 ***")
    print("책 리스트: ")
    bookName.forEach { print(it+" ") }
    println()

    while (true) {
        println()
        var price = 0
        print("원하는 책을 고르세요(그만하려면 exit)>>")
        book = readln()
        if(book=="exit") break
        for(i in bookName.indices){
            if(bookName[i]==book){
                price = bookPrice[i]
                println("선택하신 책은 $book 입니다. 가격은 $price 입니다.")
                break
            }
        }
        if (price==0)
            println("일치하는 책이 없습니다. 책 제목을 다시 입력하세요.")
        else{
            print("당신의 직업은(1.학생 2.선생님 3.기타)>>")
            var job = readln()
            when(job){
                "1" -> result = price.toFloat()*(1-stuDiscount)
                "2" -> result = price.toFloat()*(1-teaDiscount)
                else -> result = price.toFloat()
            }
            println("최종 금액은 ${result.toInt()} 원 입니다.")
        }
    }
}