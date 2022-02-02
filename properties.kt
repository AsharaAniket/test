class Computer{
    var cost = 50000f
    val name = "best computer"

    lateinit var currentUser: String

    val isExpensive: Boolean
        get() = cost > 10000f 
}

fun main(){
    val myComputer = Computer()
    println("${myComputer.cost} ${myComputer.name}")

    myComputer.currentUser = "Aniket"
    println(myComputer.currentUser)

    println(myComputer.isExpensive)
}