package moduleThreeOOP.corporation


class Assistant(
    id: Int,
    name: String,
    age: Int = 0,
    position: WorkersType
): Worker(id = id, name = name, age = age, position = WorkersType.ASSISTANT)  {
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
