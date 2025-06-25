package moduleTwoBaseSyntax

fun main(){
    val allMonth = arrayOf("Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь")
    val monthIndex = readln().toInt()
    if (monthIndex < 1 || monthIndex > 12) {
        println("Некорректное значение: $monthIndex")
    } else {
        println(allMonth[monthIndex - 1])
    }
}
