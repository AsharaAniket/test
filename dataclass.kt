/* 
    Any is a super class
    it contains functions such as 
        equals():Boolean
        hashCode(): Int
        toString(): String

    kotlin creates a copy() too
  
*/



/* 
class User(var name:String, var id:Int){

}

fun main(){

    var user1 = User("abc", 11)                             //not equal avse karan k aa be alag object compare thai che value nai
    var user2 = User("abc", 11)

    println("$user1")
    println("$user2")

    if (user1 == user2) {
        println("Equal")
    }
    else{
        println("not equal")
    }
}
*/

data class User(var name:String, var id:Int){

}

fun main(){

    var user1 = User("abc", 11)                             // Equal
    var user2 = User("abc", 11)

    if (user1 == user2) {
        println("Equal")
    }
    else{
        println("not equal")
    }
}