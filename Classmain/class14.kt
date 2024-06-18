package Classmain


open class Bird5(var name:String="Noname", var wing:Int=2, var color:String="white"){
    fun print() = println("$name, $wing, $color")
    fun fly()= println("Flying wing")
    fun sing(vol:Int)= println("Singing vol:$vol")
}
//종달새
class Lark(name:String, wing: Int, color: String):Bird5(name, wing, color){
    fun singHighTone()= println("Happy Song")
}
//앵무새
class Parrot:Bird5{
    val language:String
    constructor(name: String, wing: Int, color: String, language: String):super(name,wing,color){
        this.language = language
    }
    fun speak()= println("Speak $language")
}

fun main(){
    val coco=Bird5(name="coco", color="black")
    val lark=Bird5("myLark", 2, "red")
    val parrot=Parrot("myParrot", 2, "brown", "korean")
    coco.print(); lark.print(); parrot.print(); parrot.speak()

}