package test

fun main(){
    val num01 = 127
    val num02 = -32768
    val num03 = 9223372036854775807     // long 으로 추론

    println(" num01:$num01,num02:$num02,num03:$num03\n")

    val exp01 = 3.14
    val exp02 = 3.14F
    val exp03 = 3.14E-2
    val exp04 = 3.14e2f

    println("exp01:$exp01,exp02:$exp02,exp03:$exp03,exp04:$exp04")
}
