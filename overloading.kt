fun addition(a: Int, b: Int) : Int {
    return a + b
}

fun addition(a: Double, b: Double) : Double {
    return a + b
}

fun main(){
    
    println(addition(1,3))
    println(addition(1.0,4.0))

    println(addition(b = 3.9, a = 2.1))                // named arguments sequence follow no karvi pade
}

/*                                                 // storing function in a variable
fun addition(a: Double, b: Double) : Double {
    return a + b
}

fun main(){
    
    var fn: (a: Double, b: Double) -> Double = ::addition
    println(fn(3.1,2.9))
}
*/
