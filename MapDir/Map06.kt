package MapDir

fun main() {
    val countryMap: MutableMap<String, Int> = mutableMapOf<String, Int>()
    println("아이스크림 이름과 가격을 입력하세요.")
    var sum = 0

    for (i in 0..4) {
        print("이름, 가격 >> ")
        val (key, value) = readln().split(' ')
        countryMap.put(key, value.toInt())
    }

    var maxKey = countryMap.keys.first()
    var maxVal = countryMap.values.first()

    for ((key, value) in countryMap) {
        maxKey = key
        maxVal = value
        sum += value
    }

    println("아이스크림 이름 : ${countryMap.keys}")
    println("가격 : ${countryMap.values}")
    println("아이스크림 총 가격 = $sum")
}