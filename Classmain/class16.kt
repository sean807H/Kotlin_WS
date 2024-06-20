package Classmain

open class Shape (var name:String="도형"){
    open fun rotate()= println("${name}을 회전합니다.")
}
class Rect1(name: String, var width:Int = 1, var height:Int = 1):Shape(name){
    override fun rotate() {
        super.rotate()
        println("가로:$width, 세로:$height, 회전")
    }
}

fun main(){
    var rect = Rect1("사각형",10,20)
    rect.rotate()
}