package moduleTwoBaseSyntax

fun main() {
    print("Enter an expression: ")
    val expression = readln()
    val expressionSplitted = expression.split(" ")
    val result = when (expressionSplitted[1]) {
        "+" -> expressionSplitted[0].toDouble() + expressionSplitted[2].toDouble()
        "-" -> expressionSplitted[0].toDouble() - expressionSplitted[2].toDouble()
        "*" -> expressionSplitted[0].toDouble() * expressionSplitted[2].toDouble()
        else -> expressionSplitted[0].toDouble() / expressionSplitted[2].toDouble()
    }
    println(result)
}