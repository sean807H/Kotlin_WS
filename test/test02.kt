package test

lateinit var dept:String
val deptLength:Int by lazy{
    dept.length
}

fun main() {
    var name : String = "Kotlin"
    val age : Int = 20

    println("이름 = $name")
    println("나이 = ${age+1}")

    dept = "컴퓨터공학"
    println("학과 = $dept")
    println("학과명길이 = "+ deptLength)
}