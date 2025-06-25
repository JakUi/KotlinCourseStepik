package moduleTwoBaseSyntax

fun main() {
    print("Enter password: ")
    val password = readln().toCharArray()
    // минимум 1 буква, 1 цифра, 1 символ, длина не менее 8
    var atLeastOneLetter = false
    var atLeastOneDigit = false
    var atLeastOneSymbol = false
    var counter = 0

    for (symbol in password) {
        if (symbol.isLetter()) {
            atLeastOneLetter = true
        } else if (symbol.isDigit()) {
            atLeastOneDigit = true
        } else if (!symbol.isLetterOrDigit()) {
            atLeastOneSymbol = true
        }
        counter++
    }
    if (atLeastOneLetter  && atLeastOneDigit && atLeastOneSymbol && counter >= 8)
        println("Password is valid")
    else {
        println("Passport is invalid")
    }
}
