fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    else {
        return b
    }
}

fun main() {
    println("max of 32 and 31 is ${maxOf(32, 31)}")
}