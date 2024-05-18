package array

import java.util.*

fun main(){
    var arr2 = arrayOf(8,4,3,2,5,9,1)
    println(arr2.first())
    println(arr2.last())
    println("avg : ${arr2.average()}")
    println("sum : ${arr2.sum()}")
    println("count : ${arr2.count()}")
    println(arr2.contains(4))

    val sortedNums = arr2.sortedArray()         // 원본은 그대로 두고 정렬된 배열을 새로 할당
    val sortedNumsDesc = arr2.sortedArrayDescending()
    println(Arrays.toString(sortedNums))
    println(Arrays.toString(sortedNumsDesc))

    var arr3 = arrayOf(0,7,4,3,2,6,5,1)
    arr3.sort()                     // 원본 배열을 오름차순 정렬
    println(Arrays.toString(arr3))
    arr3.sortDescending()           // 원본 배열을 내림차순 정렬
    println(Arrays.toString(arr3))
}