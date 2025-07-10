package org.example.moduleTwoBaseSyntax

fun main(){
    val numbers = arrayOf(10, 11, 7, 8, 9, 23, 24, 25, 97, 100, 66, 77, 98)
    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}
