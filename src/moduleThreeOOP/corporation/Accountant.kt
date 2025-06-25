package moduleThreeOOP.corporation
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
    name: String,
    age: Int = 0
): Worker(name = name, age = age)  {

    val file = File("product_card.txt")

    override fun work() {
        val operationCodes = OperationCodes.entries
        while (true) {
            print("Enter the operation code. ")
            for ((index, code) in operationCodes.withIndex()) {
                print("$index - ${code.title}")
                if (index <  operationCodes.size - 1) {
                    print(", ")
                } else {
                    print(": ")
                }
            }
            val operationIndex = readln().toInt()
            val operationCode = operationCodes[operationIndex]
            when (operationCode) {
                OperationCodes.EXIT -> break
                OperationCodes.REGISTER_NEW_ITEM -> registerNewItem()
                OperationCodes.SHOW_ALL_ITEMS -> showAllItems()
                OperationCodes.REMOVE_PRODUCT_CARD -> removeProducCard()
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
        file.writeText("")
        for (card in cards) {
            saveProductCardToFile(card)
        }
    }

    fun saveProductCardToFile(productCard: ProductCard) {
        file.appendText("${productCard.name}")
        file.appendText("${productCard.brand}")
        file.appendText("${productCard.price}")
        when (productCard) {
            is FoodCard -> {
                val caloric = productCard.caloric
                file.appendText("$caloric%${ProductType.FOOD}\n")
            }

            is ShoeCard -> {
                val size = productCard.size
                file.appendText("$size%${ProductType.SHOE}\n")
            }

            is ApplianceCard -> {
                val wattage = productCard.wattage
                file.appendText("$wattage%${ProductType.APPLIANCE}\n")
            }
        }
    }

    fun loadAllCards(): MutableList<ProductCard> {
        val cards = mutableListOf<ProductCard>()
        val content = file.readText().trim()
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
                    val caloric = properties[3].toInt()
                    FoodCard(name, brand, price, caloric)
                }
                ProductType.APPLIANCE -> {
                    val wattage = properties[3].toInt()
                    ApplianceCard(name, brand, price, wattage)
                }
                ProductType.SHOE -> {
                    val size = properties[3].toFloat()
                    ShoeCard(name, brand, price, size)
                }
            }
            cards.add(productCard)
        }
        return cards
    }

    fun showAllItems() {
        val content = file.readText().trim()
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
                    val caloric = properties[3].toInt()
                    FoodCard(name, brand, price, caloric)
                }
                ProductType.APPLIANCE -> {
                    val wattage = properties[3].toInt()
                    ApplianceCard(name, brand, price, wattage)
                }
                ProductType.SHOE -> {
                    val size = properties[3].toFloat()
                    ShoeCard(name, brand, price, size)
                }
            }
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
        file.appendText("$productName%")
        print("Enter the product brand ")
        val productBrand = readln()
        file.appendText("$productBrand%")
        print("Enter the product price: ")
        val productPrice = readln().toInt()
        file.appendText("$productPrice%")
        when(productType) {
            ProductType.FOOD -> {
                print("Enter the caloric: ")
                val caloric = readln().toInt()
                file.appendText("$caloric%")
            }
            ProductType.APPLIANCE -> {
                print("Enter the wattage: ")
                val wattage = readln().toInt()
                file.appendText("$wattage%")
            }
            ProductType.SHOE -> {
                print("Enter the size: ")
                val size = readln().toFloat()
                file.appendText("$size%")
            }
        }
        file.appendText("$productType\n")
    }
}
