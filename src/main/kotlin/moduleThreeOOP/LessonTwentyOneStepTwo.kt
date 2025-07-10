package org.example.moduleThreeOOP

import kotlin.math.round


abstract class Shape(val name: String) {

    abstract fun area(): Double

    abstract fun perimeter(): Double

    protected fun roundToTwoDecimals(value: Double): Double {
        val roundedValue = round(value * 100) / 100
        return roundedValue
    }
}

class Circle(val radius: Double): Shape("Circle") {

    val pi = 3.14159

    override fun area():Double {
        return roundToTwoDecimals(pi * radius * radius)
    }

    override fun perimeter(): Double {
        return roundToTwoDecimals(2 * pi * radius)
    }
}

class Rectangle(
    val width: Double,
    val height: Double
): Shape("Rectangle") {

    override fun area(): Double{
        return roundToTwoDecimals(width * height)
    }

    override fun perimeter(): Double {
        return roundToTwoDecimals(2 * (width + height))
    }
}
