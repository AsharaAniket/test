import kotlin.reflect.KProperty

@Smart("Android")
@Smart("iOS")
// @Smart
class Phone {

    @set : Smart("Android")                                                            // adding annotation to setter
    var display: String = "Landscape"

    @get : Smart("Android")
    val selfieMode: Boolean = false

    @Smart("Android")
    // @Smart
    fun camera(){

    }
}

@Target(AnnotationTarget.FUNCTION,AnnotationTarget.CLASS, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)                             // AnnotationTarget.CLASS means only applicable to class
@Retention(AnnotationRetention.SOURCE)                                                                                                                   // SOURCE atle aplicable only compile time
@Repeatable                                                                                                                                               // RUNTIME hoi tyare Repeatable no kari saki baki error ave(me try kariyu to error no aivi maybe kari saki SIR NE PUCHVANU CHE)
// @MustBeDocumented
annotation class Smart(val os : String){

}


fun main(){

    val phoneRefObj = Phone::class                  // class literal syntax (to get runtime reference to a kotlin class)
    println(phoneRefObj.annotations)
}
