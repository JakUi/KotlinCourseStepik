package org.example.moduleTwoBaseSyntax

fun main() {
    val range = 0..1000 step 2 // создайте диапазон чётных чисел от 0 до 1000
    print("Enter number in range from 0 to 1000: ")
    val number = readln().toInt()
    if (number in range) {
        println("Your number in range of even numbers from 0 to 1000")
    } else {
        println("Your number not in range of even numbers from 0 to 1000")
    }
}
