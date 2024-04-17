package exam

fun main(){
    print("줄 수 입력(홀수)>>")
    val n = readln().toInt()
    for(line in 1..n){
        for(j in 1..(n-line)) print(" ")
        for(j in 1..(2*line-1)) print("*")
//        for(j in 1..line) print("*")
//        for(j in 2..line) print("*")
        println()
    }
}