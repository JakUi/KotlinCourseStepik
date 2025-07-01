package corporation


abstract class ProductCard(
    var name: String,
    var brand: String,
    var price: Int,
    val productType: ProductType
) {

    fun printInfo() {
        print(this)
    }
}
