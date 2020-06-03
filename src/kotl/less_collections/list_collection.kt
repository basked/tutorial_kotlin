package kotl.less_collections

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var imList = listOf<String>("basket ", "from ", "Last ", "Move ", "Crew ") //Immutable collection
    var imList2= imList.drop(3)
    println("-=Imutable List=-")
    for (word in imList) print(word)
    println()
    for (el: Int in 0..imList2.size - 1) print(imList2[el])
    println()


    println("-=Mutable List=-")
    val mList= mutableListOf ("basket ", "from ", "Last ", "Move ", "Crew ") //MutaImmutable collection
    mList.add("best ")
    mList.add("b-boy ")
    for (word in mList) print(word)
    println()
    for (el: Int in 0..mList.size - 1) print(mList[el])

    println("Types extend")
    open class People {
        var body:Int =1
        var hand:Int = 2
        var legs:Int = 3
    }

    class Person(private var name:String): People() {
     val name_:String =this.name
    }


    println("<TYPES>")
    var p= Array<People>(2) {People()}
    p[0]=People()
    if (p[0] is People)   println("Legth people ${p[0].body} ${p[0].javaClass}")
    p[1]=Person("basket") as Person
    if (p[1] is Person)  println("Name people ${(p[1] as Person).name_} ${p[0].javaClass}")


    println("<TYPES2>")
    val pp= listOf<Any>(Person("basket"),People())
     for (p1 in pp){
         when(p1){
             is People -> println("People")
             is Person -> println("Person")
         }
     }

    val peoples = mutableListOf<People>(People() as People,People() as People, Person("basket") as Person)
    for (people in peoples){
        when(people) {
            is People ->  println(people.body)
            is Person ->  println(people.name_)
        }
    }
}

