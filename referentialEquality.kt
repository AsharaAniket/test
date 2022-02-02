class Person(var name: String){

}

fun main(){

    var a = Person("Aniket")
    var b = Person("Aniket")

    println(a === b)                // object same che k nai e check kare           // referential equality
    println(a !== b)                                                                // referential inequality
}