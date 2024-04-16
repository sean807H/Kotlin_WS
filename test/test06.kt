package test

fun main(){
    val num = 10
    val formatedString = """
        var a = 6
        var b = "Kotlin"
        println(a+num)
        """
    println(formatedString)
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a+2}"
    println("str1:\"$str1\",str2:\"$str2\"")
}