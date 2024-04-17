package exam

fun main(){
    println("**로또 번호 생성을 시작합니다**")
    print("몇 장을 뽑을까요? ")
    val num = readln().toInt()
    val data_range:IntRange = 1..45
//    var data:Int = data_range.random()
    for(line in 1..num){
        print("자동번호 --> ")
        for(i in 1..6) print("${data_range.random()}  ")
        // var out = "%3d ".format(data_range.random()} print(out)
        println()
    }

}