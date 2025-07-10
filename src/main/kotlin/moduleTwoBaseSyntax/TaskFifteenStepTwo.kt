package org.example.moduleTwoBaseSyntax

fun main() {
    // Напишите программу, которая переводит значение терабайт (Тб), введенное пользователем, в байты.
    //1 Кб (килобайт) = 1024 байта
    //1 Мб (мегабайт) = 1024 Кб
    //1 Гб (гигабайт) = 1024 Мб
    //1 Тб (терабайт) = 1024 Гб
    val terabytes = readln().toInt()
    val totalBytes = terabytes * 1024L * 1024 * 1024 * 1024
    println(totalBytes)
}
