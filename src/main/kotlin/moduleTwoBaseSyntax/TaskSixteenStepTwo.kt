package org.example.moduleTwoBaseSyntax

fun main() {
    val weight = readln().toDouble()
    val price = when {
        weight > 0 && weight < 2 -> 150
        weight >= 2 && weight < 5 -> 200
        weight >= 5 && weight < 12 -> 250
        weight >= 12 && weight < 18 -> 300
        weight >= 18 && weight < 30 -> 350
        weight >= 30 && weight < 200 -> 1000
        else -> 0
    }

    if (price != 0) {
        println("$price руб./км.")
    } else {
        println("Для расчета стоимости свяжитесь с менеджером.")
    }
}
