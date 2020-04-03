package kotl.l1_variables

//private var name: String = null  // Error:(3, 27) Kotlin: Null can not be a value of a non-null type String
private var name: String? = null

fun main() {
     // рператор Элвис
    val length= name?.length?:0
    println(length)

   /* Ситуация с NPE в kotlin*/
    var b: String? = null
    val l = b!!.length
    println(l)
    /*Exception in thread "main" kotlin.KotlinNullPointerException
	at kotl.l1_variables.Nullable_typeKt.main(Nullable_type.kt:11)
	at kotl.l1_variables.Nullable_typeKt.main(Nullable_type.kt)
    * */



}
