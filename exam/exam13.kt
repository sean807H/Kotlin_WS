package exam

fun main(){
    val v_range:IntRange = 1..10
    var com:Int = v_range.random()
    var count:Int = 0
    while(true){
        print("컴퓨터가 생각한 수를 맞춰 보세요(1~10사이)>>")
        var user = readln().toInt()
        count++
        if(com == user){
            println("$count 번 만에 맞췄습니다.")
            break
        }
        else if(com > user){
            println("입력한 수가 컴값 보다 작습니다.")
        }
        else{
            println("입력한 수가 컴값 보다 큽니다.")
        }
    }
}