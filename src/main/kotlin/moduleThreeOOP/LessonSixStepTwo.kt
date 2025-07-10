package org.example.moduleThreeOOP

class CarWithConstructor {
    //сделайте все свойства неизменяемыми
    val brand: String
    val model: String
    val enginePower: Int
    val bodyColor: String

    // замените метод init() на конструктор
    constructor(brand: String, model: String, enginePower: Int, bodyColor: String) {
        this.brand = brand
        this.model = model
        this.enginePower = enginePower
        this.bodyColor = bodyColor
    }

    fun printInfo() {
        println("$brand $model $enginePower л.с. $bodyColor")
    }
}

fun taskWithConstructor() {
    val data = readln().split(" ")
    val brand = data[0]
    val model = data[1]
    val enginePower = data[2].toInt()
    val bodyColor = data[3]
    val car = CarWithConstructor(model = model, brand = brand, enginePower = enginePower, bodyColor = bodyColor)
    car.printInfo()
}

//fun main(){
//    taskWithConstructor()
//}