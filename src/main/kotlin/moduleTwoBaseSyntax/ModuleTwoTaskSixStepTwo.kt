package org.example.moduleTwoBaseSyntax

fun main() {
    val getInCash: Int = readln().toInt()
//    Доступный номинал купюр - 100, 50, 20, 10, 5, 2, 1
    val hundreds = getInCash / 100
    val fiftys = getInCash % 100 / 50
    val twentys = getInCash % 100 % 50 / 20
    val tens = getInCash % 100 % 50 % 20 / 10
    val fives = getInCash % 100 % 50 % 20 % 10 / 5
    val twos = getInCash % 100 % 50 % 20 % 10 % 5 / 2
    val ones = getInCash % 100 % 50 % 20 % 10 % 5 % 2

    println("Вам доступно:\n100$ - ${hundreds}шт\n50$ - ${fiftys}шт\n20$ - ${twentys}шт\n10$ - ${tens}шт\n" +
            "5$ - ${fives}шт\n2$ - ${twos}шт\n1$ - ${ones}шт\n")

}
