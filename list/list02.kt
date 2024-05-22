package list

fun main(){
    val lang: ArrayList<String> = ArrayList()
    lang.add("java")
    lang.add("kotlin")
    lang.add("C")

    lang.forEach { print("$it \t") }
}