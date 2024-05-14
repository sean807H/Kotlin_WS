package array

fun main(){
    var names = arrayOf<String>("java","python","html","kotlin")

    for(i in 0..names.size-1)
        println("names[$i] = ${names[i]}")
    for(i in names)
        println(i)
    for(i in names.indices)     // 순차적으로 names의 요소 순서번호(인덱스)를 i에 가져와 반복실행
        println(i)
    for((i,x)in names.withIndex())  // 순서번호와 요소값이 동시에 한 단위로 묶여서 한 싸으로 차례로 실행 반복
        print("names[$i] = $x \t")
}