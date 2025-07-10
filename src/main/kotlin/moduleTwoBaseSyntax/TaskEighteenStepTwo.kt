package org.example.moduleTwoBaseSyntax

fun main() {
    // Напишите программу, которая складывает числа введенные пользователем и выводит результат в консоль.
    val numbers = readln().split(" ")
    var result = 0
    for (number in numbers) {
        result += number.toInt()
    }
    println(result)
}
