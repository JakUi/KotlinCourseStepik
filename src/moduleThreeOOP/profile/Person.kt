package moduleThreeOOP.profile

class Person(
    private val name: String,
    private val height: Int,
    private val weight: Int
) {

    var age: Int = 0
        set(value) {
            if (value > field) {
                field = value
            } else {
                println("The new age must be bigger than the old one")
            }
        }
        get() {
            println("It's not polite to ask age.")
            return field
        }

    fun sayHello() {
        println("Hello! My name is: $name")
    }

    fun running() {
        repeat(10) {
            println("I'm running!")
        }
    }

    fun printPersonInfo() {
        println("Name: $name, age: $age, height: $height, weight: $weight")
    }
}
