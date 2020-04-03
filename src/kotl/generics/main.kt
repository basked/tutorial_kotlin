package kotl.generics

class Less_generics<T>(private val t: T) {
    var tt = t
    public fun get_info(): Unit {
        println("$t")
    }
}

fun main() {
    var lg = Less_generics(123)
    lg.get_info()
}