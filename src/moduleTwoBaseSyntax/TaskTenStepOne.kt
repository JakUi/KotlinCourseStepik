package moduleTwoBaseSyntax

fun main() {
// считать из консоли возрасты 3х человек
// рассчитать средний возраст
//    val firstPersonAge = readln().toDouble()
//    val secondPersonAge = readln().toDouble()
//    val thirdPersonAge = readln().toDouble()
//    val averageAge = (firstPersonAge + secondPersonAge + thirdPersonAge) / 3
//
//    println("Average age of these three persons is: $averageAge")

// Калькулятор. Первое число, символ, результат
    print("Enter first number")
    val firstNumber = readln().toDouble()
    print("Enter symbol")
    val symbol = readln()
    print("Enter second number")
    val secondNumber = readln().toDouble()
    var result = 0.0
    if (symbol == "+") {
        result = firstNumber + secondNumber
    } else if (symbol == "-") {
        result = firstNumber - secondNumber
    } else if (symbol == "*") {
        result = firstNumber * secondNumber
    } else if (symbol == "/") {
        result = firstNumber / secondNumber
    } else if (symbol == "%") {
        result = firstNumber % secondNumber
    }
    println("$firstNumber $symbol $secondNumber = $result")
}


