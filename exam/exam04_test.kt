package exam

fun main(){
    // 1. val(불변), var(가변)
    // 2. 2
    // 3. 2
    // 4. 2 (?.)
    // 5. X
    // 6.
    var str = "Hello"
    // var result = if(str!=null) str.length else 0
    var len = if(str!=null) str.length else 0
    println("len = ${len}")
    var len2 = str?.length?:0
    println("len2 = ${len2}")

}