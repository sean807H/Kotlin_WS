package list

fun main(){
    val course: MutableList<String> = mutableListOf("창의적종합설계","컴퓨터버전","사물인터넷")
    course.add("모바일프로그래밍")
    course.removeAt(1)
    course[0] = "리눅스"

    course.forEach { print("$it \t") }
}