package org.example.moduleTwoBaseSyntax

fun main() {
    val money = readln().toInt()
    val isHungry = readln().toBoolean()

    if (isHungry && money >= 500){
        println("You should buy a pizza")
    } else if (isHungry) {
        println("You should buy a Doshirak")
    } else if (money > 500) {
        println("You should go to the cinema")
    } else {
        println("You should go for a walk")
    }
}
