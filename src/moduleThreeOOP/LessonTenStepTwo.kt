//package moduleThreeOOP
//
//class Price(
//    val purchasePrice: Int,
//    val retailPrice: Int,
//    val wholesalePrice: Int
//) {
//}
//
//open class PowerTool(
//    val brand: String,
//    val model: String,
//    val power: Int,
//    val weight: Double,
//    val cableLength: Int,
//    val price: Price,
//    val voltage: Int = 220
//) {
//}
//
//class Drill(
//    val drillChuckDiameter: Int,
//    val minRotationSpeed: Int,
//    val maxRotationSpeed: Int,
//    brand: String,
//    model: String,
//    power: Int,
//    weight: Double,
//    cableLength: Int,
//    price: Price,
//    voltage: Int = 220
//): PowerTool(brand = brand, model = model, power = power, weight = weight, cableLength = cableLength, price) {
//}
//
//class AngleGrinder(
//    val discDiameter: Int,
//    val isSmoothStart: Boolean,
//    val isDustProtection: Boolean,
//    brand: String,
//    model: String,
//    power: Int,
//    weight: Double,
//    cableLength: Int,
//    price: Price,
//    voltage: Int = 220
//): PowerTool(brand = brand, model = model, power = power, weight = weight, cableLength = cableLength, price) {
//}
//
//class ChainSaw(
//    val chainSawTireLength: Int,
//    val chainLinksCount: Int,
//    val chainStep: Double,
//    brand: String,
//    model: String,
//    power: Int,
//    weight: Double,
//    cableLength: Int,
//    price: Price,
//    voltage: Int = 220
//): PowerTool(brand = brand, model = model, power = power, weight = weight, cableLength = cableLength, price) {
//}
