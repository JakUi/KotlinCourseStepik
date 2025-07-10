package org.example.corporation

data class Director(
    override val id: Int,
    override val name: String,
    override val age: Int,
    override val salary: Int
): Worker(
    id = id,
    name = name,
    age = age,
    salary = salary,
    position = Position.DIRECTOR
), Supplier {

    override fun buyThings() {
        println("My position is director. I'm buying things...")
    }

    override fun copy(id: Int, name: String, age: Int, salary: Int, position: Position): Worker {
        return copy(id, name, age, salary) // этот метод copy создан в data-классе по умолчанию. И он возвращает Accountant(id, name, age, salary)
    }

    fun takeCoffee (assistant: Assistant) {
        val drinkName = assistant.bringCoffee(count = 1, drinkName = "Cappucino")
        println("Thank you ${assistant.name}! The $drinkName was very delicious")
    }

    fun makeConsultantWork(consultant: Consultant) {
        val customersServerd = consultant.serveClient()
        println("Consultant ${consultant.name} served $customersServerd clients! ")
    }

    override fun work() {
        println("I'm drinking coffee")
    }
}
