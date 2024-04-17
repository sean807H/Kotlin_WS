package exam

fun main() {
    val data1: Int = 10
    val data2: Int = 10
    println("data==data2 is ${data1 == data2}")
    println("data==data2 is ${data1 === data2}")

    println()
    val int1 = Integer(10)
    val int2 = Integer(10)
    val int3 = int1
    println("int1==int2 is ${int1==int2}")
    println("int1===int2 is ${int1===int2}")
    println("int1==int3 is ${int1==int3}")
    println("int1===int3 is ${int1===int3}")
}