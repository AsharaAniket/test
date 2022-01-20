class Outer{

    var i = 10

    inner class Nested {
        fun test() {
            println("Nested class $i")
        }
    }
}

fun main(){

    /*val obj = Outer()
    println(obj.i)
    
    val nested = Outer.Nested()
    nested.test() */

    val obj = Outer()
    obj.i

    // val nested =Outer().Nested()
    // nested.test()

    val inner = Outer().Nested()
    inner.test()

}