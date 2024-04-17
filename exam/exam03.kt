package exam

fun main(){
    val str1:String = "hello"
    var str2 = "world"
    val str3 = "hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")

    var str4 = String(charArrayOf('h','e','l','l','o'))
    println("str1 === str4: ${str1 === str4}")
    println("str1 == str4: ${str1 == str4}")


}