package org.example.corporation


data class Assistant(
    override val id: Int,
    override val name: String,
    override val age: Int,
    override val salary: Int
): Worker(
    id = id,
    name = name,
    age = age,
    salary = salary,
    position = Position.ASSISTANT
), Cleaner, Supplier  {


    override fun clean() {
        println("My position is assistant. I'm cleaning workplace...")
    }

    override fun buyThings() {
        println("My position is assistant. I'm buying things...")
    }

    override fun copy(id: Int, name: String, age: Int, salary: Int, position: Position): Worker {
        return copy(id, name, age, salary) // этот метод copy создан в data-классе по умолчанию. И он возвращает Accountant(id, name, age, salary)
    }

    fun bringCoffee(count: Int, drinkName: String): String {
        repeat(count) {
            println("Встать со стула")
            println("Подойти к кофемашине")
            println("Проверить наличие чашки")
            println("Проверить наличие кофе")
            println("Нажать на кнопку приготовления кофе $drinkName")
            println("Дождаться пока кофе $drinkName будет готов")
            println("Забрать чашку кофе")
            println("Доставить чашку кофе")
        }
//        return drinkName
        return "Espresso"
    }

    override fun work() {
        println("I'm answering the phone right now...")
    }
}
