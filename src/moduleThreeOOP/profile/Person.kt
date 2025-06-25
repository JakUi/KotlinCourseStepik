package moduleThreeOOP.profile

class Person {
    //    val name: String = ""
//    val age: Int = 0
    val name: String
    val age: Int
    val height: Int
    val weight: Int

//    fun init(name: String, age: Int, height: Int, weight: Int){
//        this.name = name
//        this.age = age
//        this.height = height
//        this.weight = weight
//    }
    constructor(name: String, age: Int, height: Int, weight: Int){
    this.name = name
    this.age = age
    this.height = height
    this.weight = weight
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
