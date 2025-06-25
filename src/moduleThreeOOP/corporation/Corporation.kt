package moduleThreeOOP.corporation

//fun main() {
////    val assistant = Assistant()
////    assistant.bringCoffee(5, "espresso")
//    print("Enter name: ")
//    val name = readln()
//    print("Enter brand: ")
//    val brand = readln()
//    print("Enter size: ")
//    val size = readln().toInt()
//    print("Enter price: ")
//    val price = readln().toInt()
//    val productCard = ProductCard(name = name, brand = brand, size = size, price = price)
//    print("Enter consultant name: ")
//    val consultantName = readln()
//    print("Enter consultant age (if you don't want to say your age enter 0: ")
//    val consultantAge = readln().toInt()
//    val consultant = Consultant(consultantName, consultantAge)
////    productCard.name = name
////    productCard.brand = brand
////    productCard.size = size
////    productCard.price = price
////    println("Name ${productCard.name} Brand ${productCard.brand} Size ${productCard.size} Price ${productCard.price}")
////    productCard.init(name, brand, size, price)
////    productCard.init(name = name, brand = brand, size = size, price = price)
//    productCard.printIfo()
//    consultant.sayHello()
//}

//fun main() {
//    val director: Worker = Director("Ksana", 42)
////    val assistant = Assistant(name = "Ivan")
////    director.takeCoffee(assistant)
//    val consultant: Worker = Consultant("Nika")
////    consultant.serveClient()
//    val assistant: Worker = Assistant(name = "John", age = 34)
//    (assistant as Assistant).bringCoffee(1, "Espresso")
//    (director as Director).makeConsultantWork(consultant as Consultant)
//    director.takeCoffee(assistant)
//}

//fun main() {
//    val director = Director("Ksana", 42)
//    val consultant = Consultant("Nika")
//    val assistant = Assistant(name = "John", age = 34)
//    val employers = listOf<Worker>(director, consultant, assistant)
//    for (employe in employers) {
//        employe.work()
//    }
//}

//fun main() {
//    val shoeCard = ShoeCard(name = "Sneakers", brand = "Nike", size = 41f, price = 3000)
//    shoeCard.printIfo()
//}

fun main() {
    val director = Director("Ksana", 42)
    val consultant = Consultant("Nika")
    val assistant = Assistant(name = "John", age = 34)
    val accountant = Accountant("Konstantin", 37)
    val employers = listOf<Worker>(director, consultant, assistant, accountant)
    for (employe in employers) {
        employe.work()
    }
}