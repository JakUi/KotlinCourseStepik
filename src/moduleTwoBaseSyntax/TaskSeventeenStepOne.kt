package moduleTwoBaseSyntax

fun main() {
    var symbol = 'A'
    // 65 - 90
    println(symbol)
    val range = 66..90
    for (r in range) {
        symbol++
        println(symbol)
    }
    // or (using "repeat")
//    repeat(26){
//        println(symbol)
//        symbol++
//    }
    // or using "while"
//    while (symbol <= 'Z') {
//        println(symbol)
//        symbol++
//    }
}
