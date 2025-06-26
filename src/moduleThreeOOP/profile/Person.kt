package moduleThreeOOP.profile

class Person(
    private val name: String,
    private val age: Int,
    private val height: Int,
    private val weight: Int
) {

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
