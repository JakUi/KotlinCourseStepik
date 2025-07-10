package org.example.moduleThreeOOP

enum class DaysOfWeek(val title: String) {
    SUNDAY(title = "Воскресенье"), MONDAY(title = "Понедельник"), TUESDAY(title = "Вторник"), WEDNESDAY(title = "Среда"),
    THURSDAY(title = "Четверг"), FRIDAY(title = "Пятница"), SATURDAY(title = "Суббота")
}

fun taskFourteen() {
    val days = DaysOfWeek.entries
    for (day in days) {
        println(day.title)
    }
}

fun main() {
    taskFourteen()
}