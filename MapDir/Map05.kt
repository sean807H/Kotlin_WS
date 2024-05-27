package chapter3

fun main() {
    val countryMap: MutableMap<String, Int> = mutableMapOf<String, Int>()
    println("나라 이름과 숫자를 5개 입력하세요.")

    for (i in 0..4) {
        print("나라이름, 인구 입력 >> ")
        val (key, value) = readln().split(' ')
        countryMap.put(key, value.toInt())
    }

    var maxKey = countryMap.keys.first()
    var maxVal = countryMap.values.first()

    for ((key, value) in countryMap) {
        if (maxVal < value) {
            maxKey = key
            maxVal = value
        }
    }
    println("제일 인구가 많은 나라는 ($maxKey,$maxVal)")
}