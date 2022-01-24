data class User(val username: String, val authToken: AuthToken)

data class Account(val authToken: AuthToken)

data class Order(val authToken: AuthToken)


typealias AuthToken = String
fun main(){

    val user = User("Aniket", authToken = "25158521-FDSFD65554")
    println(Order(user.authToken))
}