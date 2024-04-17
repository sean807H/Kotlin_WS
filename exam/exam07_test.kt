package exam/*fun main(){
    print("온도를 입력해주세요 : ")
    var sun = readln().toDouble()
    print("단위를 입력해주세요 : ")
    var num = readln().toString()
    var gg: Double = 0.0
    if(num == "F") {
        gg = (sun - 32) / 1.8
    }
    else if(num == "C") {
        gg = (sun * 1.8) + 32
    }

    println("$sun F는 $gg C입니다") // 30.5와 F
}*/

fun main(){
    println("=화씨를 섭씨로 온도 변위 변환 프로그램=")
    print("온도를 입력 >> ")
    var temp = readln().toDouble()

    print("단위를 입력(F or C) >> ")
    var unit = readln().toUpperCase()

    var result: Double
    if(unit == "F") {
        result = (temp - 32) / 1.8
        println("$temp(F)는 ${"%.2f".format(result)}(C)입니다")
    }
    else if(unit == "C"){
        result = (temp * 1.8)+32
        println("$temp(C)는 ${"%.2f".format(result)}(F)입니다")
    }
    else
        println("정상적인 온도 단위가 아닙니다")
}