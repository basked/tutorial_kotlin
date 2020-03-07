package l1_variables

fun main(args: Array<String>) {
    // изменяеиые переменные
    var vStr1: String // строка, без инициализации
    var vStr2: String = "basket" // строка, с инициализацией
    var vStr3: String? = null // строка,с инициализацией, может принимать NULL
    var vStr4 = "BASKED" // строка,с инициализацией,  без указания типа
    val vStr5: String? = "teksab" // строка,  константа
    vStr1 = "basked"
    println("String variables: $vStr1, $vStr2, $vStr3, $vStr4, $vStr5")
    //-------------------------------

    var vCh1: Char  // символ, без инициализации
    var vCh2: Char = 'b' // символ, с инициализацией
    var vCh3: Char? = null  // символ,с инициализацией, может принимать NULL
    var vCh4 = 'c' // символ, с инициализацией,  без указания типа
    val vCh5: Char? = 'd' // символ, с инициализацией, константа
    vCh1 = 'a'
    println("Char variables: $vCh1,$vCh2,$vCh3,$vCh4,$vCh5")
    //-------------------------------

    var vInt1: Int  // целое
    var vInt2: Int = 31  // целое, с инициализацией
    var vInt3: Int?=null  // целое,с инициализацией, может принимать NULL
    var vInt4 = 32  //целое,с инициализацией,  без указания типа
    var vInt5: Int? = 33   // целое,с инициализацией,  константа
    vInt1=30
    println("Integer variables: $vInt1,$vInt2,$vInt3,$vInt4,$vInt5 ")
    //-------------------------------

    var vD1: Double // дробное, без инициализации
    var vD2: Double = 1.63234234234253235325 // дробное, с инициализацией
    var vD3: Double? = null // дробное,с инициализацией, может принимать NULL
    var vD4: Double = 1.63234234234253235325 // с инициализацией,  без указания типа
    val vD5: Double? = 1.63234234234253235325 // с инициализацией,  константа
    vD1=1.3434
    println("Double variables: $vD1,$vD2,$vD3,$vD4,$vD5")
    //-------------------------------

    var vF1: Float // дробное, с точкой, без инициализации
    var vF2: Float = 1.1111111F // дробное, с точкой, с инициализацией
    var vF3: Float? = null // дробное,с инициализацией, может принимать NULL
    var vF4: Float = 1.2222222F *555// дробное,с инициализацией,  без указания типа
    val vF5: Float? = 1.333333F // дробное, константа
    vF1=234234.6757F
    println("Float variables: $vF1,$vF2,$vF3,$vF4,$vF5")
    //-------------------------------

    var vB1: Boolean // лигическое, без инициализации
    var vB2: Boolean = true // лигическое, с инициализацией
    var vB3: Boolean? = null // лигическое, может принимать NULL
    var vB4 = false // лигическое, с инициализацией,  без указания типа
    val vB5: Boolean? = true or false //  лигическое, константа
    vB1= true and false
    println("Boolean variables: $vB1,$vB2,$vB3,$vB4,$vB5")
}
