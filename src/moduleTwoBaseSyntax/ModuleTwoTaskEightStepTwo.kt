package moduleTwoBaseSyntax

fun main() {
    val isCargo = readln().toBoolean()
    val enginePower = readln().toInt()

    if (!isCargo && enginePower > 250) {
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 150 руб./л.с.\nСумма налога: ${enginePower * 150} руб.")
    } else if (!isCargo && enginePower > 200) {
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 75 руб./л.с.\nСумма налога: ${enginePower * 75} руб.")
    } else if (!isCargo && enginePower > 150) {
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 49 руб./л.с.\nСумма налога: ${enginePower * 49} руб.")
    } else if (!isCargo && enginePower > 100) {
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 34 руб./л.с.\nСумма налога: ${enginePower * 34} руб.")
    } else if (!isCargo) {
        println("Вид ТС: легковой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 10 руб./л.с.\nСумма налога: ${enginePower * 10} руб.")
    }
    if (isCargo && enginePower > 250) {
        println("Вид ТС: грузовой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 85 руб./л.с.\nСумма налога: ${enginePower * 85} руб.")
    } else if (isCargo && enginePower > 200) {
        println("Вид ТС: грузовой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 65 руб./л.с.\nСумма налога: ${enginePower * 65} руб.")
    } else if (isCargo && enginePower > 150) {
        println("Вид ТС: грузовой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 50 руб./л.с.\nСумма налога: ${enginePower * 50} руб.")
    } else if (isCargo && enginePower > 100) {
        println("Вид ТС: грузовой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 40 руб./л.с.\nСумма налога: ${enginePower * 40} руб.")
    } else if (isCargo) {
        println("Вид ТС: грузовой автомобиль\nМощность двигателя: $enginePower л.с.\nНалоговая ставка: 25 руб./л.с.\nСумма налога: ${enginePower * 25} руб.")
    }
}
