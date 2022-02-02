/*
Kotlin supports visibility modifiers
    public          //everything is public by nature in kotlin
    protected       //not applicable to top level classes and functions      
    internal        //accessible to same module
    private         //accessible to same file  
*/

open class Person{

    private val a = 1       //private
    protected val b = 2     //protected
    internal val c = 3      //internal
    val d = 4               //public
}

class Indian: Person(){
    
    // a is not visible
    // b, c, d are visible
}

fun main(){

}

