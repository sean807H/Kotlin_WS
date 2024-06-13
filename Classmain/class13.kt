package Classmain

class Rect(var width:Int=1, var height: Int=1) {
    fun getArea():Int { return width * height   }
}
fun main(){
    var arr:ArrayList<Rect> = ArrayList()
    var sum = 0
    for (i in 1..4) {
        print("$i 너비와 높이 >> ")
        var (w, h) = readln().split(" ").map { it.toInt() }
        arr.add(Rect(w,h))
    }

    println("저장하였습니다...")
    for(data in arr) sum+=data.getArea()
    println("사각형의 전체 합은 ${sum}")
}

