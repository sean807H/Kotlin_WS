package test

fun main(){
    var str1:String?="Kotlin"
    println(str1)
    //str1 = null

    println("str1 = $str1, length = ${str1?.length}")
    println("str1 = $str1, length = ${str1?.length?:0}")
    println("str1 = $str1, length = ${str1!!.length}")
}
