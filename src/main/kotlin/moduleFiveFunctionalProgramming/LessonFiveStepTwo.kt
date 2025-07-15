package org.example.moduleFiveFunctionalProgramming

fun processNumbers(numbers: List<Int>, filter: (Int) -> Boolean, filteredProcessing: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()


    for (number in numbers) {
        if (filter(number)) { // Использовать лямбда-выражение для отбора чисел, которые соответствуют определенному условию (возвращает Boolean).
            result.add(filteredProcessing(number)) // Использовать лямбда-выражение для преобразования отобранных чисел (возвращает Int).
        }
    }
    return result // Возвращать новый список, содержащий преобразованные числа.
}

fun startProcessing() {
    println("Введите числа, разделенные пробелами:") // Вывести сообщение: "Введите числа, разделенные пробелами:".
    val strings = readln().split(" ") // Считать строку чисел, введённую пользователем.
    val numbers = strings.map { it.toInt() } // Преобразовать строку в список чисел
    val result = processNumbers(numbers, { it > 10 }, { it * 3 } )
    println("Результат обработки: $result")
}

fun main() {
    startProcessing()
}