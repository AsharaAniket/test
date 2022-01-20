class Event<T>(value: T? = null){                       //ama apde T ni sathe bijo generics variable pan lai saki for example-  class Event<T, V>(value: T? = null, data: V)    T and V lai to pachi ama sequence maintain karva ni

    init {
        if (value != null){
            println(value.toString().length)            // example ne lagtu nathi pan lai
                                                        // all Sloths are mammal all pandas are mammal ----- covariance (only goes one way)    Producer<out Mammal>
                                                        // mirrored version/reflection on covariance   ----- contavariance                     Consumer<in Mammal>
        }else{
            println("Empty parameters")
        }
    }
}

fun main(){
    
    Event<String>("Aniket")
    Event(6573)
    Event<String>()
}



/* class Event<T>(value: T){

    init {
        println(value.toString().length)
    }
}

fun main(){
    
    Event<String>("Aniket")         // string ni length
    Event(6573)                     // num ne string ma count kari ne ani length
    Event(true)                     // boolean ne as a string count kari ne ani length
}

*/
