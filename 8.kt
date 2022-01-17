fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}
    
fun main() {
    val stringList = listOf("one", "two", "ka", "four")
    
    val stringSet = setOf("four", "two", "ka", "one")

    printAll(stringList)
    printAll(stringSet)
}

// mutable collection, mutable list, mutable set, mutable map