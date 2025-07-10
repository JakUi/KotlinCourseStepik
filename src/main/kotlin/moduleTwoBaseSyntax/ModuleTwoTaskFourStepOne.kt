package org.example.moduleTwoBaseSyntax

fun main() {
    print("Введите оценку от 1 до 5: ")
    val grade = readln()
    print("Введите комментарий: ")
    val comment = readln()
    println("Спасибо за Вашу оценку!\nВы поставили: $grade\nВы оставили комментарий: $comment")
}