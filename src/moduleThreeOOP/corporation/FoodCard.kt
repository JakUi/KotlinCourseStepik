package moduleThreeOOP.corporation

class FoodCard(
    name: String,
    brand: String,
    price: Int,
    val caloric: Int
): ProductCard(name = name, brand = brand, price = price, ProductType.FOOD) {

    override fun toString(): String {
        return "Name ${this.name} Brand ${this.brand} Price ${this.price} Product type ${productType.title} Caloric ${caloric}\n"
    }
}
