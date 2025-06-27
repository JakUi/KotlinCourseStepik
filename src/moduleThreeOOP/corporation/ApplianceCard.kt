package moduleThreeOOP.corporation

class ApplianceCard(
    name: String,
    brand: String,
    price: Int,
    val wattage: Int
): ProductCard(name = name, brand = brand, price = price, ProductType.APPLIANCE) {

    override fun toString(): String {
        return "Name ${this.name} Brand ${this.brand} Price ${this.price} Product type ${productType.title} Wattage $wattage\n"
    }
}
