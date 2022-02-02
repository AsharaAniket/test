/*
sealed class cannot be instantiated directly 

same module ma inherite kari saki  baki compilation error ave

*/

sealed class Data{

    data class Success(val data: String) : Data()
    data class Error(val error: String) : Data()
    object Loading : Data()
}

fun getData() : Data{

    return Data.Success((1..100).random().toString())
}

fun main(){
    val data = getData()
    when(data){
        is Data.Success -> {
            println(data)
        }
        is Data.Error -> {
            println(data)
        }
        is Data.Loading -> {
            println(data)
        }
    }
}