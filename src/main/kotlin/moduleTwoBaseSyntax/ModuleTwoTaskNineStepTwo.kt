package org.example.moduleTwoBaseSyntax

fun main() {
    val isCargo = readln().toBoolean()
    val enginePower = readln().toInt()
    var tax: Int

    if (enginePower > 250) {
        if (!isCargo){
            tax = 150
        } else {
            tax = 85
        }
    } else if (enginePower > 200) {
        if (!isCargo) {
            tax = 75
        } else {
            tax = 65
        }
    } else if (enginePower > 150) {
        if (!isCargo) {
            tax = 49
        } else {
            tax = 50
        }
    } else if (enginePower > 100) {
        if (!isCargo) {
            tax = 34
        } else {
            tax = 40
        }
    } else if (!isCargo) {
        tax = 10
    } else {
        tax = 25
    }

    if (isCargo) {
        println("Вид ТС: грузовой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: $tax руб./л.с.\nСумма налога: ${enginePower * tax} руб.")
    } else {
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: $tax руб./л.с.\nСумма налога: ${enginePower * tax} руб.")
    }
}
