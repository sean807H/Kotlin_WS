package list

fun main(){
    val langList: ArrayList<String> = arrayListOf("java","kotlin","C")
    langList.add("JSP")
    langList[2] = "Python"
    langList.remove("C")

    langList.forEach { print("$it \t") }
}