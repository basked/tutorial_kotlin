package kotl.specialist.level1.day4

infix fun Int.sm(other: Int) = this + other
fun main() {
    val s: Int = 23 sm 11
    val k=34;
    print("basket ${s.sm(k)}")
}