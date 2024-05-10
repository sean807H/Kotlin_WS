package array

fun main(){
    var a = IntArray(5)
    var b = Array<Int>(5){0}        // 제네릭 구조

    var array = Array<Int>(2,{0})
    var stringArray = Array<String>(2,{""})

    var intArray = IntArray(2)
    var charArray = CharArray(2,{'a'})
    var floatArray = FloatArray(2,{1.0f})
    var doubleArray = DoubleArray(2)
    var longArray = LongArray(2)
    var booleanArray = BooleanArray(2)

    var anyArray = arrayOf(1,"값",true,12.2)

    var stringFunArray = arrayOfNulls<String>(2)
    var intFunArray = intArrayOf(1,2,3)
    var charFunArray = charArrayOf('a','b')
    var floatFunArray = floatArrayOf(1.0f,2.0f)
    var doubleFunArray = doubleArrayOf(2.0,3.0)
    var booleanFunArray = booleanArrayOf(true, false, true)
}