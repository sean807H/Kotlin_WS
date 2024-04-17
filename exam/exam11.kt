package exam

fun main(){
    var x = 0
    var sum = 0
    while(x<10){
        sum += ++x
    }
    println(sum)

    var y = 0
    var sums = 0
    while(true){
        sums += ++y
        if(y==10) break
    }
    println(sums)

    do{
        var z = 0
        var sum1 = 0
        sum1 += ++z
        if(z == 10)break
    }while (true)
//    println(sum1)
}