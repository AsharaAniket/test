class Box{
    var lenght : Int = 10
    var width : Int = 20
    var height : Int = 5

    val volume
        get() = lenght * width * height

    var boxName : String = "box name"
    set(value) {
        if (value.length < 3){
            println("Name cannot be less than 3 characters")
        }
        else{
        field = value
        }
    }
}

fun main(){

    val box1 = Box()

    box1.height = 21

    println("lenght: ${box1.lenght}")
    println("width: ${box1.width}")
    println("height: ${box1.height}")
    println("volume: ${box1.volume}")

    box1.boxName = "My box"
    println("box name: ${box1.boxName}")


}