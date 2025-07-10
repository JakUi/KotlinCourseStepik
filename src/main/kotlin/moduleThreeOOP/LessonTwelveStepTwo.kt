package org.example.moduleThreeOOP

open class PowerTool(
    val brand: String,
    val model: String,
) {
    open fun turnOn() {
        println("Электроинструмент включен")
    }
}

class Drill(
    brand: String,
    model: String,
    val drillChuckDiameter: Int,
): PowerTool(brand, model) {
    override fun turnOn() {
        println("Дрель сверлит")
    }
}

class AngleGrinder(
    brand: String,
    model: String,
    val discDiameter: Int,
): PowerTool(brand, model) {

    override fun turnOn(){
        println("УШМ режет")
    }
}

class ChainSaw(
    brand: String,
    model: String,
    val chainSawTireLength: Int,
): PowerTool(brand, model) {
    //переопределить метод turnOn()
    override fun turnOn() {
        println("Цепная пила пилит")
    }
}

fun taskTwelve() {
    // создайте здесь коллекцию инструментов и в цикле вызовите у них метод turnOn()
    val drill: Drill = Drill(brand = "dfa", model = "m1", drillChuckDiameter = 5)
    val angleGrinder: AngleGrinder = AngleGrinder(brand = "asdf", model = "m1", discDiameter = 12 )
    val chainSaw: ChainSaw = ChainSaw(brand = "asdf", model = "m3", chainSawTireLength = 24)
    val powerTools: List<PowerTool> = arrayListOf(drill, angleGrinder, chainSaw)

    for (tool in powerTools) {
        tool.turnOn()
    }
}
