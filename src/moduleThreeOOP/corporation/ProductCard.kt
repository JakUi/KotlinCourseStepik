package moduleThreeOOP.corporation


abstract class ProductCard(
    var name: String,
    var brand: String,
    var price: Int,
    val productType: ProductType
) {
    abstract fun printInfo()

//    abstract fun printInfo() {
//        print("Name ${this.name} Brand ${this.brand} Price ${this.price} Product type ${productType.title} ")
//    }
}
