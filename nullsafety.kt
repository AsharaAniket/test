var firstName : String? = null

val lastName : String = "Ashara"

fun main(){

    println("Hello $firstName $lastName")
    // println("Hello ${firstName.length}")       ama error ave che karan k ani value null che atle


    println("${firstName?.length}")

    firstName = "Aniket"
    println("${firstName!!.length}")            // !! tyarej use karvanu k apan ne khabar che k value null nathij baki exception throw karse
}