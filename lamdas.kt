fun main(){
    
    val findArea: (Int, Int) -> Int = {length, breadth ->
        length * breadth
    }
    println(findArea(3, 12))
}