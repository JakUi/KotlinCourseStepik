package moduleThreeOOP.corporation

import kotlin.random.Random

class Consultant(
    id: Int,
    name: String,
    age: Int = 0
): Worker(id = id, name = name, age = age, position = Position.CONSULTANT)  {

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
