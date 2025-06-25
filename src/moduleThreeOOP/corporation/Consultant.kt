package moduleThreeOOP.corporation

import kotlin.random.Random

class Consultant(
    name: String,
    age: Int = 0
): Worker(name = name, age = age) {

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
