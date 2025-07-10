package org.example.moduleTwoBaseSyntax

fun main() {
//    print("Enter your age: ")
//    val age = readln().toInt()
//    repeat(age) {
//        println("Happy birthday!")
//    }

    print("Enter your age: ")
    var age = readln().toInt()
    val tilEighteen = 18 - age
    if (tilEighteen > 0) {
        repeat(tilEighteen) {
            println("Wait one more year...(")
        }
    }
    if (age > 0) {
        while (age < 18) {
            println("Wait one more year...(")
            age++
        }
    }
    println("You can go to the cinema")
}
