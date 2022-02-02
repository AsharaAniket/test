/*
    Generate cod/files              // cant modify existing files
    validation          

    is an object we can add to our metadata to our code     

    @Target - specifies the possible kinds of elements which can be annotated with the annotation (such as classes, functions, properties, and expressions);

    @Retention - specifies whether the annotation is stored in the compiled class files and whether it's visible through reflection at runtime (by default, both are true);

    @Repeatable - allows using the same annotation on a single element multiple times;

    @MustBeDocumented - specifies that the annotation is part of the public API and should be included in the class or method signature shown in the generated API documentation.
*/

class Phone{

    @Deprecated("Please use SmartCamera", ReplaceWith("SmartCamera"))
    fun Camera(){
        println("Camera is recording")
    }

    fun SmartCamera(){
        println("SmartCamera is recording")
    }
}

fun main(){

    val phone = Phone()
    phone.Camera()
}