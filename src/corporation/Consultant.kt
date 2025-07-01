package corporation

import kotlin.random.Random

class Consultant(
    id: Int,
    name: String,
    age: Int = 0,
    salary: Int,
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
