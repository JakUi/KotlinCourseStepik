package corporation

class ShoeCard(
    name: String,
    brand: String,
    price: Int,
    val size: Float
): ProductCard(name = name, brand = brand, price = price, ProductType.SHOE) {

    override fun toString(): String {
        return "Name ${this.name} Brand ${this.brand} Price ${this.price} Product type ${productType.title} Size $size\n"
    }
}
