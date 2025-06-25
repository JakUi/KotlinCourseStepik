package moduleTwoBaseSyntax

fun main() {
    val number = readln().toInt()
    var sum = 0
    var counter = 1
    while (counter <= number) {
        sum += counter
        counter++
    }
    println("Сумма чисел от 1 до $number равна $sum")
}
