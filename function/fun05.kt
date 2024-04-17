package function

fun summ(a: Int, b: Int):Int{
    var summ = 0
    fun calSum(){
        for(i in a..b){
            summ += i
        }
    }
    calSum()
    return summ
}
fun main(){
    print("시작 값 입력 >> ")
    var x = readln().toInt()
    print("끝 값 입력 >> ")
    var y = readln().toInt()
    println("$x ~ $y 까지의 합 = ${summ(x,y)}")
}