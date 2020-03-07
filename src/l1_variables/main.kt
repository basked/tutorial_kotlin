package l1_variables

fun main() {
    learnVariables()
}

// Types Variables
fun learnVariables() {

    var vStr1: String // строка, без инициализации
    var vStr2: String = "basket" // строка, с инициализацией
    var vStr3: String? = null // строка,с инициализацией, может принимать NULL
    var vStr4 = "BASKED" // строка,с неявной инициализацией,  без указания типа
    val vStr5: String? = "teksab" // строка,  константа
    vStr1 = "basked"
    println("String variables: $vStr1, $vStr2, $vStr3, $vStr4, $vStr5")
    //-------------------------------

    var vCh1: Char  // символ, без инициализации
    var vCh2: Char = '\uFF00' // символ, с инициализацией
    var vCh3: Char? = null  // символ,с инициализацией, может принимать NULL
    var vCh4 = '\t' // символ, с инициализацией,  без указания типа
    val vCh5: Char? = '\n' // символ, с неявной инициализацией, константа
    vCh1 = 'a'
    println("Char variables: $vCh1,$vCh2,$vCh3,$vCh4,$vCh5")
    //-------------------------------

    /* Тип  	Количество бит
       Int	    32
       Short	16
       Byte	8
       Double	64
       Float	32
       Long	64
   */

    var vInt1: Int  // целое
    var vInt2: Int = -2_147_483_648  // целое, с инициализацией
    var vInt3: Int? = null  // целое,с инициализацией, может принимать NULL
    var vInt4 = 32  //целое,с неявной инициализацией  без указания типа
    val vInt5: Int? = 33   // целое,  константа
    vInt1 = Int.MAX_VALUE
    println("Integer(32 bit) variables: $vInt1,$vInt2,$vInt3,$vInt4,$vInt5 ")
    //-------------------------------
    var vSh1: Short  // целое
    var vSh2: Short = -32_768 // целое, с инициализацией
    var vSh3: Short? = null  // целое,с инициализацией, может принимать NULL
    var vSh4 = 32  //целое,с неявной инициализацией  без указания типа
    val vSh5: Short? = 32_767   // целое,  константа
    vSh1 = Short.MAX_VALUE
    println("Short(16 bit) variables: $vSh1,$vSh2,$vSh3,$vSh4,$vSh5 ")
    //-------------------------------
    var vBt1: Byte  // целое
    var vBt2: Byte = -128 // целое, с инициализацией
    var vBt3: Byte? = null  // целое,с инициализацией, может принимать NULL
    var vBt4 = 32  //целое,с неявной инициализацией  без указания типа
    val vBt5: Byte? = 127   // целое,  константа

    vBt1 = Byte.MAX_VALUE
    println("Byte(8 bit) variables: $vBt1,$vBt2,$vBt3,$vBt4,$vBt5 ")
    //-------------------------------

    var vD1: Double // дробное, без инициализации
    var vD2: Double = 1.63234234234253235325 // дробное, с инициализацией
    var vD3: Double? = null // дробное,с инициализацией, может принимать NULL
    var vD4 = 1.63234234234253235325 // дробное,неявной инициализацией,  без указания типа
    val vD5: Double? = 1.63234234234253235325 //дробное, с инициализацией,  константа
    vD1 = 1.3434
    println("Double(64 bit) variables: $vD1,$vD2,$vD3,$vD4,$vD5")
    //-------------------------------

    var vF1: Float // дробное, с точкой, без инициализации
    var vF2: Float = 1.1111111F // дробное, с точкой, с инициализацией
    var vF3: Float? = null // дробное,с инициализацией, может принимать NULL
    var vF4 = 1.2222222F * 555// дробное,неявной инициализацией,  без указания типа
    val vF5: Float? = 1.333333F // дробное, константа
    vF1 = 234234.6757F
    println("Float(32 bit) variables: $vF1,$vF2,$vF3,$vF4,$vF5")
    //-------------------------------


    var vL1: Long // лигическое, без инициализации
    var vL2: Long = 2_147_483_647L //десятичное
    var vL3: Long? = 0x0FB0// двоичное, может принимать NULL
    var vL4 = 0b0001111 // лигическое, с неявной инициализацией ,  без указания типа
    val vL5: Long? = 345345L //  лигическое, константа
    vL1 = Long.MAX_VALUE
    println("Long(32 bit) variables: $vL1,$vL2,$vL3,$vL4,$vL5")
    //-------------------------------

    var vB1: Boolean; // лигическое, без инициализации
    var vB2: Boolean = false //десятичное
    var vB3: Boolean? = true// двоичное, может принимать NULL
    var vB4 = false // лигическое, с неявной инициализацией ,  без указания типа
    val vB5: Boolean? = false && true //  лигическое, константа
    vB1 = Boolean.equals(true)
    println("Boolean variables: $vB1,$vB2,$vB3,$vB4,$vB5")
}


// Operators  https://kotlinlang.ru/docs/reference/operator-overloading.html
fun learnOperators() {
    val i = 5
    val j = 10
    var res = i + j
    println("Operator add: $i+$j=$res")
    res = j - i
    println("Operator subtract: $j-$i=$res")
    res = j / i
    println("Operator divide: $j/$i=$res")
    res = j * i
    println("Operator multiply: $j*$i=$res")
    //---------------------------------------
    res++
    println("Operator ++: $res")
    res--
    println("Operator --: $res")
    res += 9
    println("Operator +=: $res")
    res -= 9
    println("Operator +=: $res")
    res *= 6
    println("Operator *=: $res")
    res /= 60
    println("Operator /=: $res")
    res %= 3
    println("Operator %=: $res")
}
