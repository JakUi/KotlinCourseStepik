package moduleThreeOOP.corporation

//class ProductCard(
//    var name: String,
//    var brand: String,
//    var size: Int,
//    var price: Int
//) {
//
////    fun init(name: String, brand: String, size: Int, price: Int) {
////        this.name = name
////        this.brand = brand
////        this.size = size
////        this.price = price
////    }
//
//    fun printIfo() {
//        println("Name ${this.name} Brand ${this.brand} Size ${this.size} Price ${this.price}")
//    }
//}

open class ProductCard(
    var name: String,
    var brand: String,
    var price: Int
) {
    open fun printInfo() {
        print("Name ${this.name} Brand ${this.brand} Price ${this.price} ")
    }
}
