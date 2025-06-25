package moduleTwoBaseSyntax

fun main() {
    val enginePower: Int = readln().toInt()
    val tax: Int

//    if (enginePower <= 100) {
//        tax = enginePower * 10
//        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 10 руб./л.с.\nСумма налога: $tax руб.")
//    } else if (enginePower > 100) {
//        if (enginePower <= 150){
//            tax = enginePower * 34
//            println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 34 руб./л.с.\nСумма налога: $tax руб.")
//        }
//        else if (enginePower > 150) {
//            if (enginePower <= 200) {
//                tax = enginePower * 49
//                println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 49 руб./л.с.\nСумма налога: $tax руб.")
//            }
//            else if (enginePower > 200) {
//                if (enginePower <= 250) {
//                    tax = enginePower * 75
//                    println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 75 руб./л.с.\nСумма налога: $tax руб.")
//                }
//                else {
//                    tax = enginePower * 150
//                    println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 150 руб./л.с.\nСумма налога: $tax руб.")
//                }
//            }
//        }
//    }

    if (enginePower > 250) {
        tax = enginePower * 150
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 150 руб./л.с.\nСумма налога: $tax руб.")
    } else if (enginePower > 200) {
        tax = enginePower * 75
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 75 руб./л.с.\nСумма налога: $tax руб.")
    } else if (enginePower > 150) {
        tax = enginePower * 49
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 49 руб./л.с.\nСумма налога: $tax руб.")
    } else if (enginePower > 100) {
        tax = enginePower * 34
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 34 руб./л.с.\nСумма налога: $tax руб.")
    } else {
        tax = enginePower * 10
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 10 руб./л.с.\nСумма налога: $tax руб.")
    }
}
