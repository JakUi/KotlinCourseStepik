package org.example.corporation


data class Accountant(
    override val id: Int,
    override val name: String,
    override val age: Int,
    override val salary: Int
): Worker(
    id = id,
    name = name,
    age = age,
    salary = salary,
    position = Position.ACCOUNTANT
), Cleaner, Supplier  {

    private val workersRepository = WorkersRepository
    private val cardsRepository = ProductCardsRepository

    override fun clean() {
        println("My position is accountant. I'm cleaning workplace...")
    }

    override fun buyThings() {
        println("My position is accountant. I'm buying things...")
    }

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
                OperationCodes.EXIT -> {
                    workersRepository.saveChanges()
                    cardsRepository.saveChanges()
                    break
                }
                OperationCodes.REGISTER_NEW_ITEM -> registerNewItem()
                OperationCodes.SHOW_ALL_ITEMS -> showAllItems()
                OperationCodes.REMOVE_PRODUCT_CARD -> removeProductCard()
                OperationCodes.REGISTER_NEW_EMPLOYEE -> registerNewEmployee()
                OperationCodes.FIRE_AN_EMPLOYEE -> fireEmployee()
                OperationCodes.SHOW_ALL_EMPLOYEES -> showAllEmployees()
                OperationCodes.CHANGE_SALARY -> changeSalary( )
                OperationCodes.CHANGE_AGE -> changeAge()
            }
        }
    }

    private fun removeProductCard() {
        print("Enter name of card for removing: ")
        val name = readln()
        cardsRepository.removeProductCard(name)
    }

    private fun showAllItems() {
        for (productCard in cardsRepository.productCards) {
            productCard.printInfo()
        }
    }

    override fun copy(id: Int, name: String, age: Int, salary: Int, position: Position): Worker {
        return copy(id, name, age, salary) // этот метод copy создан в data-классе по умолчанию. И он возвращает Accountant(id, name, age, salary)
    }

    private fun registerNewItem() {
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
        cardsRepository.registerNewItem(card)
    }

    private fun registerNewEmployee() {
        val positions = Position.entries
        print("Choose position - ")
        for ((index, position) in positions.withIndex()) {
            print("$index - ${position.title}")
            if (index <  positions.size - 1) {
                print(", ")
            } else {
                print(": ")
            }
        }
        val positionIndex = readln().toInt()
        val position = positions[positionIndex]
        print("Enter id: ")
        val id = readln().toInt()
        print("Enter name: ")
        val name = readln()
        print("Enter age: ")
        val age = readln().toInt()
        print("Enter salary: ")
        val salary = readln().toInt()
        val worker = when (position) {
            Position.DIRECTOR -> Director(id, name, age, salary)
            Position.ACCOUNTANT -> Accountant(id, name, age, salary)
            Position.ASSISTANT -> Assistant(id, name, age, salary)
            Position.CONSULTANT -> Consultant(id, name, age, salary)
        }
        workersRepository.registerNewEmployee(worker)
    }

    private fun fireEmployee() {
        print("Enter employee's id to fire: ")
        val id = readln().toInt()
        workersRepository.fireEmployee(id)
    }

    private fun changeSalary() {
        print("Enter employee's id to change salary: ")
        val id = readln().toInt()
        print("Enter new salary: ")
        val salary: Int = readln().toInt()
        workersRepository.changeSalary(id, salary)
    }

    private fun changeAge() {
        print("Enter employee's id to change age: ")
        val id = readln().toInt()
        print("Enter employee's age: ")
        val age = readln().toInt()
        workersRepository.changeAge(id, age)
    }

    private fun showAllEmployees() {
        val allEmployees = workersRepository.workers
        for (employee in allEmployees) {
            employee.printInfo()
        }
    }
}
