package moduleThreeOOP.corporation

class FoodCard(
    name: String,
    brand: String,
    price: Int,
    val caloric: Int
): ProductCard(name = name, brand = brand, price = price) {

    override fun printInfo() {
        super.printInfo()
        println("Amount of calories $caloric")
    }
}
