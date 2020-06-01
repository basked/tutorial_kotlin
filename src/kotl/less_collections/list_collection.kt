package kotl.less_collections

fun main() {
    var imList = listOf<String>("basket ", "from ", "Last ", "Move ", "Crew ") //Immutable collection
    println("-=Imutable List=-")
    for (word in imList) print(word)
    println()
    for (el: Int in 0..imList.size - 1) print(imList[el])


    println("-=Mutable List=-")
    var mList= mutableListOf ("basket ", "from ", "Last ", "Move ", "Crew ") //MutaImmutable collection
    mList.add("best ")
    mList.add("b-boy ")



    for (word in mList) print(word)
    println()
    for (el: Int in 0..mList.size - 1) print(mList[el])


}