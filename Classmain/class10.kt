package Classmain

class Card(var kind:String="Spade",var num:Int=1){
    companion object{
        var width = 100
        var height:Int = 250
        fun showSize() = println("카트의 폭은 : $width, 높이는 $height")
    }
    fun show(name:String) = println("${name} >> 무늬 : $kind 값 : $num")
}

fun main(){
    Card.showSize()

    val c1 = Card("Heart",7)
    c1.show("c1")

    val c2 = Card("Spade",1)
    c1.show("c2")

    Card.width = 50
    Card.height = 80
    Card.showSize()
}