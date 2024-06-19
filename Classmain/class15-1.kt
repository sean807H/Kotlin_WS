package Classmain

fun main(){
    var birdArr:ArrayList<Bird6> = ArrayList()
    birdArr.add(Lark2("종달새",2,"회색"))
    birdArr.add(Parrot2("앵무새",2,"빨강","한국어"))
    for (i in birdArr){
        i.print(); i.fly(); i.sing(2)
        if(i is Lark2) i.singHighTone()
        println()
    }
    var b = birdArr.get(0) as Lark2
    b.singHighTone()
}