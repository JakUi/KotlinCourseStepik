package org.example.moduleTwoBaseSyntax

fun main() {
    // пользователь вводит номер месяца - программа выводит сообщение "вы ввели номер такой-то ему соотв-ует месяц такой-то"
//    print("Enter number of month: ")
//    val monthNumber = readln().toInt()
//    val month: String = when (monthNumber) {
//        1 -> "January"
//        2 -> "February"
//        3 -> "March"
//        4 -> "April"
//        5 -> "May"
//        6 -> "June"
//        7 -> "July"
//        8 -> "August"
//        9 -> "September"
//        10 -> "October"
//        11 -> "November"
//        12 -> "December"
//        else -> ""
//    }
//    println("You entered number $monthNumber which corresponds to $month")

    // полшьзователь вводит название месяца - программа выводит к какому времени года он относится
    // если месяца не существует - программа выводит сообщение, что такого месяца не существует
    print("Enter month name: ")
    val monthName = readln()
    val season: String = when (monthName) {
        "December", "January", "February" -> "Winter"
        "March", "April", "May" -> "Spring"
        "June", "July", "August" -> "Summer"
        "September", "October", "November" -> "Autumn"
        else -> ""
    }
    if (season == "") {
        println("Month doesn't exist")
    } else {
        println("$monthName corresponds to $season")
    }

}