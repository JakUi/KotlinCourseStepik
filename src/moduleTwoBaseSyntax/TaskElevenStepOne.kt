package moduleTwoBaseSyntax

fun main(){
//    val family = listOf<String>("Kseniia", "Konstantin", "Morris", "Valentina", "Anastasia", "Eduard")
//    val motherInLaw = family[3]
//    println(motherInLaw)
    print("Enter index of a month (1-12): ")
    val monthIndex: Int = readln().toInt()
    val daysInMonth = listOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    if (monthIndex < 0 || monthIndex > 12) {
        println("Enter value between 1 and 12")
    } else {
        println("Amount of days in this $monthIndex month are: ${daysInMonth[monthIndex - 1]}")
    }
}
