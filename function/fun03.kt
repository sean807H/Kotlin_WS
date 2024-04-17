package function

fun sayHello(name: String) = println("hello! $name")    //널 허용안함

fun sayHello1(name: String?){       //널 허용
    if(name==null){
        println("Hello!! Korea")
    }
    else{
        println("Hello!!"+name)
    }
}

fun main(){
    sayHello1(null)
    sayHello1("Kim")
}