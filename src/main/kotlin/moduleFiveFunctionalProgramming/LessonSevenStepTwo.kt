package org.example.moduleFiveFunctionalProgramming

fun List<Int>.sumOfEvens(): Int {
    var result: Int = 0
    for (number in this) {
        if (number % 2 == 0) {
            result += number
        }
    }
    return result
}

fun processList() {
    val numbersAsString = readln().trim().split(" ")
    val numbers = numbersAsString.map { it.toInt() }
    println("Сумма чётных чисел: ${numbers.sumOfEvens()}")
}

fun main() {
    processList()
}
