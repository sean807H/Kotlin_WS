package Classmain

class Circle ( var name : String = "피자", var radius: Int = 1){
    var pi:Double=3.14
    fun area() = println("${name}피자의 넓이 ${pi*radius*radius}")
    fun around() = println("${name}의 둘레 ${pi*radius*2}")
    fun show() = println("${name}의 반지름 ${radius}")
}
fun main(){
    val pizza:Circle=Circle(radius = 50)
    pizza.around()
    pizza.show()

    val donut : Circle=Circle("도넛", 10)
    donut.show()
    donut.area()
}