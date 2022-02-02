class InitOrderDemo(name: String) {

    val firstProperty = "First property: $name".also(::println) //bhege bhegu print karva
    init {
        println("First initializer block that prints $name")
    }
    
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    InitOrderDemo("anything")
}

/* class Constructors {
    init {
        println("Init block")
    }
                                                        // constructor vada no example
    constructor(i: Int) {
        println("Constructor $i")
    }
}

fun main() {
    Constructors(123)
} */