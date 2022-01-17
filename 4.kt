fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(n1: String, n2: String) {

    val x = parseInt(n1)
    val y = parseInt(n2)

    if (x != null && y != null) {
        println(x + y)
    }
    else {
        println("$n1 or $n2 is not a number")
    }    
}

fun main() {
    printProduct("34", "24")
    printProduct("a", "75")
    printProduct("a", "b")
}