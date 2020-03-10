/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
data class Person(val _name: String, val _age: Int) {
    val name = _name
    private val age = _age
    fun getInfo() {
        println("Info about Person Name=$name, age=$age")
    }
}

fun getName(name: String = "basket") {
    println("My name is $name")
}

fun main() {
    val person = Person("basket1", 30)
    val list = mutableListOf<Person>(
        Person("basket0", 30),
        Person("basket1", 31),
        Person("basket2", 32),
        Person("basket3", 33)
    )

    list.forEach { pers ->
        println("Name=${pers.name}")
    }
    // есть ли person.name с таким именем в list
    println("Name from object person equals ${person.name} in list person  ${list.any { it.name == person.name }}")

    val p = Person("teksab", 25)
    list.add(p)

    list[4].getInfo()

    list.forEach { per ->
        println("Name=${per.name}")
    }
    // Сортировка
    println("SORT DESC --------------------------")
    list.sortByDescending { it.name }
    list.forEach{
        println("${it.name}")
    }

    println("FIRST, LAST , Nth elements --------------------------")
    println("First el ${list.first().name}")
    println("First el ${list.last().name}")

}



