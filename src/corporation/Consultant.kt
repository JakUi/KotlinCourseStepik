package corporation

import kotlin.random.Random

data class Consultant(
    override val id: Int,
    override val name: String,
    override val age: Int,
    override val salary: Int
): Worker(
    id = id,
    name = name,
    age = age,
    salary = salary,
    position = Position.CONSULTANT
), Cleaner  {

    override fun clean() {
        println("My position is consultant. I'm cleaning workplace...")
    }

    override fun copy(id: Int, name: String, age: Int, salary: Int, position: Position): Worker {
        return copy(id, name, age, salary) // этот метод copy создан в data-классе по умолчанию. И он возвращает Accountant(id, name, age, salary)
    }

    fun sayHello() {
        if (age > 0) {
            println("Привет! Меня зовут $name. мне $age лет.")
        } else {
            println("Привет! Меня зовут $name.")
        }
    }

    fun serveClient(): Int {
        val count = Random.nextInt(0, 100)
        repeat(count) {
            print("Client was served! ")
        }
        println()
        return count
    }

    override fun work() {
        serveClient()
    }
}
