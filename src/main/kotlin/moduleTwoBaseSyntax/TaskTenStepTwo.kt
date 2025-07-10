package org.example.moduleTwoBaseSyntax

fun main() {
    val radius = readln().toDouble()
    val piConstant = 3.14
    val circleLength = 2 * piConstant * radius
    val circleArea = piConstant * radius * radius
    // 2pr
    // s = pr^2
    println("Радиус: $radius\nДлина окружности: $circleLength\nПлощадь круга: $circleArea")
}
