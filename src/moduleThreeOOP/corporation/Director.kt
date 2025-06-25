package moduleThreeOOP.corporation

class Director(
    name: String,
    age: Int
): Worker(name = name, age = age) {

//        val assistant = Assistant("Helen")
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
