package moduleTwoBaseSyntax

fun main(){
    // Программа уже содержит коллекцию марок автомобилей (к ней можно обратиться по имени brands).
    // Напишите код, который запрашивает у пользователя марку и проверяет, содержится ли она в коллекции.
    // Результат true/false выведите в консоль.
    val brands = listOf("Mercedes", "BMW", "Volvo", "Toyota")
    val brand = readln()
    var index = 0
    var brandFound = false
    while (index < brands.size) {
        if (brands[index] == brand) {
            brandFound = true
            break
        }
        index++
    }
    for (b in brands) {
        if (b == brand) {
            brandFound
            break
        }
    }
    println(brandFound)
}
