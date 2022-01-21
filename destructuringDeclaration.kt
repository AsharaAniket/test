data class Student(val name: String, val subject: String){

}

fun main(){

    val student = Student("Aniket", "Kotlin")

    val(a,b) = student                              // baki sada ma apde ------- a = student.name avu karta ama simple thai jai
    println("$a $b")
}