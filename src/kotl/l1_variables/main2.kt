package kotl.l1_variables


fun main() {
    val name = "Ivan"
//    name=23  Error:(6, 10) Kotlin: The integer literal does not conform to the expected type String
//    name = "Max" Error:(7, 5) Kotlin: Val cannot be reassigned
    var age =0 // все типы в Kotlin ссылочные нет примитивных типов
    age = 23
    println("Name=$name Age=$age")
}