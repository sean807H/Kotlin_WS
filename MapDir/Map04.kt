package MapDir

fun main(){
    var memberBook:MutableMap<String, String> = mutableMapOf<String, String>()
    insertEmail("gildong.hong@google.com",memberBook)
    insertEmail("good.lee@naver.com",memberBook)
    insertEmail("sam.kim@daum.com",memberBook)
    for (id in memberBook.keys) println(id)
    for (domain in memberBook.values) println(domain)
}
fun insertEmail(email:String?, mBook:MutableMap<String,String>){
    if(email==null){
        println()
        return
    }
    var atPos=email.indexOf('@')
    if (atPos==-1 || atPos==email.lastIndex){
        println("이메일 주소가 잘 못 되었습니다.")
        return
    }
    var key = email.substring(0..atPos-1)
    var value = email.substring(atPos+1..email.lastIndex)
    mBook.put(key, value)
}