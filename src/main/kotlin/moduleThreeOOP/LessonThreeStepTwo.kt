package org.example.moduleThreeOOP

// создайте класс Car с мутабельными полями brand (String), model (String), enginePower (Int), bodyColor (String).
//
//Добавьте в этот класс метод drive(), который выводит в консоль сообщение: Еду на автомобиле
class CarWithMethods {
    var brand = ""
    var model = ""
    var enginePower = 0
    var bodyColor = ""

    fun drive() {
        println("Еду на автомобиле")
    }
}
