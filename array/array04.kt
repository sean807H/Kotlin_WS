package array

fun main(){
    var names = arrayOfNulls<String>(4)
    names[0]="kim"
    names.set(1,"kang")

    var n0 = names[0]
    var n1 = names.get(1)
    println("$n0, $n1")
}