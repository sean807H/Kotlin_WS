package exam

fun main(){
    print("점수를 입력해주세요 : ")
    var wjatn: Int
    var num: String
    wjatn = readln().toInt()
    num =  if(wjatn>=90)
        "A"
    else if(wjatn>=80)
        "B"
    else if(wjatn>=70)
        "C"
    else if(wjatn>=60)
        "D"
    else
        "F"

    println("$num")

}
