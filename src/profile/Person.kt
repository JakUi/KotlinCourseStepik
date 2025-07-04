package profile


class Person(
    val name: String,
    val lastName: String,
    val height: Int,
    val weight: Int
) {

    fun copy(
        name: String = this.name,
        lastName: String = this.lastName,
        height: Int = this.height,
        weight: Int = this.weight
    ) = Person(name, lastName, height, weight)

    val fullName: String
        get() = "$name $lastName"

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

    override fun toString(): String {
        return "Person(name='$name', lastName='$lastName', height=$height, weight=$weight, fullName='$fullName', age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person) return false
        return this.height == other.height && this.weight == other.weight && this.name == other.name &&
               this.lastName == other.lastName
    }

    override fun hashCode(): Int {
        var result = height
        result = 31 * result + weight
        result = 31 * result + name.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }
}
