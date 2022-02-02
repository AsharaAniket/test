/* 
when we want to represent a group of constants we can use enum
most things inside enum is object
*/

interface DoColor{
    fun doColor()
}

enum class Color(val colorName: String, val colorValue: Int) : DoColor{

    RED("Red", 10){
        override fun doColor(){
            println("Colored with Red")
        }
    },
    GREEN("Green", 20){
        override fun doColor(){
            println("Colored with Green")
        }
    },
    BLUE ("Blue", 30){
        override fun doColor(){
            println("Colored with Blue")
        }
    }
}
fun main(){

    println(Color.RED.colorName)
    println(Color.RED.colorValue)

    Color.GREEN.doColor() 
}

/*
enum class Color{
    RED,                //objects
    GREEN,
    BLUE
}

fun main(){

    Color.values().forEach { println(it) }

    val color = Color.RED

    when (color) {
        Color.RED -> println("REEEEEEEEEEEEEEED")
        Color.GREEN -> println("GREEEEEEEEEEEEEEN")
        Color.BLUE -> println("BLUEEEEEEEEEEEEEE")
    }
}

*/