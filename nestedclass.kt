class Outer{

    var i = 10

    class Nested {
        fun test() {
            println("Nested class")         // aya hu $i kari ne i ni value no lai saku ana mate inner class no use karvo pade refer innerclass.kt
        }
    }
}

fun main(){

    val obj = Outer()
    println(obj.i)
    
    val nested = Outer.Nested()
    nested.test()
}