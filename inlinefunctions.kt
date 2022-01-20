/*
    we use it to enhance the performance of higher order function

    sada ma kotlin bytecode ma lamda no instance bane pan agar INLINE FUNCTION hoi to function sidho copy kari ne lamda ma muki dye instance ni jagya a 
*/

inline fun inlineFunction(fn: () -> Unit){
    fn()
    println("inline function")
}

fun main(){
    inlineFunction { println("calling inline function")}
}