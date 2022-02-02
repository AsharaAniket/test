// import kotlin.reflect.KProperty
// // import kotlin.reflect.full.declaredFunctions


// fun isEven(x: Int) = x%2==0


// fun main(){

//     val myList = listOf(1, 2, 3, 4, 5, 6, 7)

//     myList.filter { isEven(it) }.forEach { println(it) }

//     // val function = myList::class.declaredFunctions
//     // println(function)

//     // val function = myList::class.members
//     // println(function)
// }


import kotlin.reflect.KProperty
// import kotlin.reflect.full.declaredFunctions


fun isEven(x: Int) = x%2==0


fun main(){

    val myList = listOf(1, 2, 3, 4, 5, 6, 7)
    myList.filter (::isEven).forEach (::println)
}