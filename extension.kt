fun Int.arthmetic(number:Int){

    println("Addition is ${this+number}")
    println("Subtration is ${this-number}")
    println("Multiplication is ${this*number}")
}

fun main(){
    
    val num = 2        //aa as a this kaam karse arithmetic function ma
    num.arthmetic(1)   //aa as a number kaam karse arithmetic function ma
}