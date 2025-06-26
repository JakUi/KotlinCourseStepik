package moduleThreeOOP.corporation
import moduleThreeOOP.corporation.OperationCodes.*
import java.io.File

// Моё решение (блок кода ниже)
//class Accountant(
//    name: String,
//    age: Int = 0
//): Worker(name = name, age = age)  {
//
////    fun addNewProduct(name: String, brand: String, price: Int, caloric: Int = 0, wattage: Int = 0,
////                      size: Float = 0f) {
////        val card: ProductCard = ProductCard(name, brand, price)
////        card.printIfo()
////        if (caloric > 0) {
////            print("Amount of calories $caloric")
////        } else if (wattage > 0) {
////            print("Wattage $wattage")
////        } else if (size > 0) {
////            print("Size $size")
////        }
////        println()
////    }
//
//    override fun work() {
//        print("Enter the operation code. 0 - exit, 1 - register new item: ")
//        var operationCode = readln().toInt()
//        while (operationCode == 1) {
//            print("Enter the product type. 0 - food, 1 - appliance, 2 - shoe: ")
//            val productType = readln().toInt()
//            print("Enter the product name: ")
//            val name = readln()
//            print("Enter the product brand ")
//            val brand = readln()
//            print("Enter the product price: ")
//            val price = readln().toInt()
//            val card: ProductCard = ProductCard(name, brand, price)
//            if (productType == 0) {
//                print("Enter amount of calories: ")
//                val caloric = readln().toInt()
//                card.printIfo()
//                print("Amount of calories $caloric")
//            } else if (productType == 1) {
//                print("Enter wattage: ")
//                val wattage = readln().toInt()
//                card.printIfo()
//                print("Wattage $wattage")
//            } else {
//                print("Enter size: ")
//                val size = readln().toFloat()
//                card.printIfo()
//                print("Size $size")
//            }
//            print("Enter the operation code. 0 - exit, 1 - register new item: ")
//            operationCode = readln().toInt()
//        }
//    }
//}

// Решение преподавателя (для дальнейшей работы):
class Accountant(
    id: Int,
    name: String,
    age: Int = 0
): Worker(id = id, name = name, age = age, position = WorkersType.ACCOUNTANT)  {

    val fileProductCards = File("product_card.txt")
    val employeesFile = File("employees.txt")

    override fun work() {
        val operationCodes = OperationCodes.entries
        while (true) {
            println("Enter the operation code.")
            for ((index, code) in operationCodes.withIndex()) {
                println("$index - ${code.title}")
            }
            val operationIndex = readln().toInt()
            val operationCode = operationCodes[operationIndex]
            when (operationCode) {
                EXIT -> break
                REGISTER_NEW_ITEM -> registerNewItem()
                SHOW_ALL_ITEMS -> showAllItems()
                REMOVE_PRODUCT_CARD -> removeProducCard()
                REGISTER_NEW_EMPLOYEE -> registerNewEmployee()
                FIRE_AN_EMPLOYEE -> fireAnEmployee()
                SHOW_ALL_EMPLOYEES -> showAllEmployees()
            }
        }
    }

    fun removeProducCard() {
        val cards: MutableList<ProductCard> = loadAllCards()
        print("Enter name of card for removing: ")
        val name = readln()
        for (card in cards) {
            if (card.name == name) {
                cards.remove(card)
                break
            }
        }
        fileProductCards.writeText("")
        for (card in cards) {
            saveProductCardToFile(card)
        }
    }

    fun saveProductCardToFile(productCard: ProductCard) {
        fileProductCards.appendText("${productCard.name}%${productCard.brand}%${productCard.price}%")
        when (productCard) {
            is FoodCard -> {
                val caloric = productCard.caloric
                fileProductCards.appendText("$caloric%")
            }

            is ShoeCard -> {
                val size = productCard.size
                fileProductCards.appendText("$size%")
            }

            is ApplianceCard -> {
                val wattage = productCard.wattage
                fileProductCards.appendText("$wattage%")
            }
        }
        fileProductCards.appendText("${productCard.productType}\n")
    }

    fun loadAllCards(): MutableList<ProductCard> {
        val cards = mutableListOf<ProductCard>()
        if (!fileProductCards.exists()) fileProductCards.createNewFile()
        val content = fileProductCards.readText().trim()
        if (content.isEmpty()) {
            return cards
        }
        val cardsAsString = content.split("\n")
        for (cardAsString in cardsAsString) {
            val properties = cardAsString.split("%")
            val name = properties[0]
            val brand = properties[1]
            val price = properties[2].toInt()
            val type = properties.last()
            val productType = ProductType.valueOf(type)
            val productCard = when (productType) {
                ProductType.FOOD -> {
                    val caloric = properties[2].toInt()
                    FoodCard(name, brand, price, caloric)
                }
                ProductType.APPLIANCE -> {
                    val wattage = properties[2].toInt()
                    ApplianceCard(name, brand, price, wattage)
                }
                ProductType.SHOE -> {
                    val size = properties[2].toFloat()
                    ShoeCard(name, brand, price, size)
                }
            }
            cards.add(productCard)
        }
        return cards
    }

    fun showAllItems() {
        val productCards = loadAllCards()
        for (productCard in productCards) {
            productCard.printInfo()
        }
    }

    fun registerNewItem() {
        val productTypes = ProductType.entries
        print("Enter the product type. ")
        for ((index, type) in productTypes.withIndex()) {
             print("$index - ${type.title}")
            if (index <  productTypes.size - 1) {
                print(", ")
            } else {
                print(": ")
            }
        }
        val productTypeIndex = readln().toInt()
        val productType: ProductType = productTypes[productTypeIndex]
        print("Enter the product name: ")
        val productName = readln()
        print("Enter the product brand ")
        val productBrand = readln()
        print("Enter the product price: ")
        val productPrice = readln().toInt()
        val card = when(productType) {
            ProductType.FOOD -> {
                print("Enter the caloric: ")
                val caloric = readln().toInt()
                FoodCard(productName, productBrand, productPrice, caloric)
            }
            ProductType.APPLIANCE -> {
                print("Enter the wattage: ")
                val wattage = readln().toInt()
                ApplianceCard(productName, productBrand, productPrice, wattage)
            }
            ProductType.SHOE -> {
                print("Enter the size: ")
                val size = readln().toFloat()
                ShoeCard(productName, productBrand, productPrice, size)
            }
        }
        saveProductCardToFile(card)
    }

    fun registerNewEmployee() {
        print("Choose position - ")
        val workersTypes = WorkersType.entries
        for ((index, type) in workersTypes.withIndex()) {
            print("$index - ${type.title}")
            if (index <  workersTypes.size - 1) {
                print(", ")
            } else {
                print(": ")
            }
        }
        val workerIndex = readln().toInt()
        val workerType = workersTypes[workerIndex]
        print("Enter id: ")
        val id = readln().toInt()
        print("Enter name: ")
        val name = readln()
        print("Enter age: ")
        val age = readln().toInt()
        val employee = fillEmployeeCard(id, name, age, workerType)
//        val employee = when (workerType) {
//            WorkersType.DIRECTOR -> Director(id, name, age)
//            WorkersType.ACCOUNTANT -> Accountant(id, name, age)
//            WorkersType.ASSISTANT -> Assistant(id, name, age)
//            WorkersType.CONSULTANT -> Consultant(id, name, age)
//        }
        saveEmployeeToFile(employee)
//        employeesFile.appendText("${employee.id}%${employee.name}%${employee.age}%${employee.position}\n")
    }

    fun fillEmployeeCard(id: Int, name: String, age: Int, workerType: WorkersType): Worker {
        val employee = when (workerType) {
            WorkersType.DIRECTOR -> Director(id, name, age)
            WorkersType.ACCOUNTANT -> Accountant(id, name, age)
            WorkersType.ASSISTANT -> Assistant(id, name, age)
            WorkersType.CONSULTANT -> Consultant(id, name, age)
        }
        return employee
    }

    fun loadAllEmployees(): MutableList<Worker> {
        val employees = mutableListOf<Worker>()
        if (!employeesFile.exists()) employeesFile.createNewFile()  // если файла нет, то он создастся
        val content = employeesFile.readText().trim()
        if (content.isEmpty()) return employees
        val employeesAsString = content.split("\n")
        for (employeeAsString in employeesAsString) {
            val properties = employeeAsString.split("%")
            val id = properties[0].toInt()
            val name = properties[1]
            val age = properties[2].toInt()
            val workAs = properties.last()
            val workerType = WorkersType.valueOf(workAs)
            val workerCard = fillEmployeeCard(id, name, age, workerType)
//            val workerCard = when (worker) {
//                WorkersType.DIRECTOR -> Director(id, name, age)
//                WorkersType.ACCOUNTANT -> Accountant(id, name, age)
//                WorkersType.ASSISTANT -> Assistant(id, name, age)
//                WorkersType.CONSULTANT -> Consultant(id, name, age)
//            }
            employees.add(workerCard)
        }
        return employees
    }

    fun saveEmployeeToFile(employee: Worker) {
        employeesFile.appendText("${employee.id}%${employee.name}%${employee.age}%${employee.position}\n")
    }

    fun fireAnEmployee() {
        val employees: MutableList<Worker> = loadAllEmployees()
        print("Enter employee's id to fire: ")
        val id = readln().toInt()
        for (emp in employees) {
            if (emp.id == id) {
                employees.remove(emp)
                break
            }
        }
        employeesFile.writeText("")
        for (e in employees) {
            saveEmployeeToFile(e)
        }
    }

    fun showAllEmployees() {
        val allEmployees = loadAllEmployees()
        for (employee in allEmployees) {
            employee.printWorkerInfo()
        }
    }
}
