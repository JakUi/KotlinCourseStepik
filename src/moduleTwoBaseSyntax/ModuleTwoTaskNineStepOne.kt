package moduleTwoBaseSyntax

fun main() {
    var temperature = readln().toInt()
    var airConditionerIsOn = false

    if (temperature > 25) {
        airConditionerIsOn = true
    } else if  (temperature < 20) {
        airConditionerIsOn = false
    }
    if (airConditionerIsOn) {
        temperature -= 5
        airConditionerIsOn = false
    }
    println("The temperature is: $temperature")
    if (temperature > 25) {
        airConditionerIsOn = true
    } else if  (temperature < 20) {
        airConditionerIsOn = false
    }
    if (airConditionerIsOn) {
        temperature -= 5
    }
    println("The temperature is: $temperature")
}