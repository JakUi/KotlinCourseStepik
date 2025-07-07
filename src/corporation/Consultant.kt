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

    override fun copy(salary: Int, age: Int): Consultant {
        return Consultant(this.id, this.name, age, salary)
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
