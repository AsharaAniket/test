/*
    it is an abnormal condition which means code is successfully compiled and you can execute it but while executing it any event that interupts the normal flow
    of your code execution is called EXCEPTION (Any error that occurs in run time is called an EXCEPTION)
    Arithmetic exception, null pointer exception, IO exception, Index out of bound exception

    try lakhi atle catch lakhvu compulsory che but jo apde finally lakhi to catch no lakhi to chale

    CATCH   - exception hoi to a block execute thase
    FINALLY - a block run thasej  irrespective of exception

    Throwable
    Exception
    all other exceptions that are pre defined
*/

// val a = 5
// val b = 0

// val names = listOf("Aniket")

// fun main(){

//     try {
//         println(names[3])       // exception aya throw thiyo to aya thi break lagi jase pachi no code run nai thai     have sidhu catch block ma execute karva lagse
//     }
//     catch(e: IndexOutOfBoundsException) {
//         println(e.message)
//     }
//     finally {
//         println("Hello this is important code that need to be executed irrespective of exception")
//     }
// }

/* 
    fun main(){

        val a = 10
        val b = 0

        val result = try{ a/b } catch(e: ArithmeticException) {0} // return 0    // try catch as expression
        println(result)
    }
*/


// Thowable
// fun vote(name: String, age: Int){

//     if(age < 18){
//         throw IllegalArgumentException("Younger than 18, Cannot vote")
//     }
//     println("$name voted")
// }

// fun main(){

// }


class IllegalVoterException(message: String) : Exception(message)

fun vote(name: String, age: Int){

    if(age < 18){
        throw IllegalVoterException("Younger than 18, Cannot vote")
    }
    println("$name voted")
}

fun main(){
    vote("Aniket", 21)
}

