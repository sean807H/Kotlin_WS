package exam/*fun main(){
    print("음료수 종류 입력 : ")
    var whdfb = readln().toString()
    print("잔수 입력 : ")
    var wkstn = readln().toInt()
    var result:Int = 0

    if(whdfb == "에프"){
        result = wkstn * 2000
        println("$result 원 입니다")
    }
    else if(whdfb == "아메"){
        result = wkstn * 2500
        println("$result 원 입니다")
    }
    else if(whdfb == "카푸"){
        result = wkstn * 3000
        println("$result 원 입니다")
    }
    else{
        println("없는 메뉴 입니다")
    }
}*/

/*fun main(){
    print("음료수 종류 입력 : ")
    var whdfb = readln().toString()
    print("잔수 입력 : ")
    var wkstn = readln().toInt()
    var result:Int = 0

    when(whdfb){
        "에프" -> {
            result = wkstn * 2000
            println("$result 원 입니다")
        }
        "아메" -> {
            result = wkstn * 2500
            println("$result 원 입니다")
        }
        "카푸" -> {
            result = wkstn * 3000
            println("$result 원 입니다")
        }
        else -> {
            println("없는 메뉴 입니다")
        }
    }
}*/

fun main(){
    print("점수 입력해 : ")
    val score = readln().toDouble()
    var grade:Char = 'F'
    when(score){
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}