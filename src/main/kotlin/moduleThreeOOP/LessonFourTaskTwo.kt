package org.example.moduleThreeOOP

//Доработайте класс Car
//
//Добавьте в этот класс метод refuel() (заправиться), который принимает в качестве параметра название АЗС (String),
// марку бензина (String), и кол-во литров (Int), которое нужно заправить. Метод выводит в консоль:
//
//Произведена заправка на АЗС "{НАЗВАНИЕ_АЗС}"
//Марка бензина: {МАРКА}
//Кол-во литров: {КОЛИЧЕСТВО}
//
//В функции task() создайте экземпляр класса Car и вызовите у него метод refuel() с аргументами, которые считаете из консоли.
//
//На ввод в консоли все три параметра поступают одной строчкой и разделены пробелом. Вам понадобятся методы readln() и split()

class CarRefuel {
    var brand = ""
    var model = ""
    var enginePower = 0
    var bodyColor = ""

    fun drive() {
        println("Еду на автомобиле")
    }

    fun refuel(stationName: String, gas: String, volume: Int) {
        println("Произведена заправка на АЗС \"$stationName\"")
        println("Марка бензина: $gas")
        println("Кол-во литров: $volume")
    }
}

fun task() {
    val car = CarRefuel()
    val data = readln().split(" ")
    car.refuel(data[0], data[1], data[2].toInt())
}
