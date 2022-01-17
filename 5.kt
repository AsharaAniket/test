fun getStringLength(obj: Any): Int? {  //any is a super type
    if (obj is String) {
        return obj.length
    }
    return null
}

fun main() {
    fun printLength(obj: Any) {
        println("Getting the length of '$obj'. \nResult: ${getStringLength(obj) ?: "The object is not a string"} ")
    }
    printLength("helloworld")
    printLength(5000)
}