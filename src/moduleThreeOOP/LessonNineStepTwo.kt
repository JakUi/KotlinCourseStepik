package moduleThreeOOP


class DeliveryObject(
    val length: Int,
    val width: Int,
    val height: Int,
    val weight: Double
) {
}

class Pack(
    var length: Int,
    var width: Int,
    var height: Int,
    var type: String = "Картонная коробка",
    var weight: Double
) {
}

class Cargo(
    val length: Int,
    val width: Int,
    val height: Int,
    val typePackaging: String,
    val netWeight: Double,
    val grossWeight: Double
) {

    fun printInfo(){
        println("Длина: $length")
        println("Ширина: $width")
        println("Высота: $height")
        println("Тип упаковки: $typePackaging")
        println("Вес нетто: $netWeight")
        println("Вес брутто: $grossWeight")
    }
}

class Warehouse() {
    fun getPack(deliveryObject: DeliveryObject): Pack {
        val pack = Pack(length = deliveryObject.length, width = deliveryObject.width,
                        height = deliveryObject.height, weight = 0.3)
        pack.length++
        pack.width++
        pack.height++
        return pack
    }

    fun packCargo(deliveryObject: DeliveryObject): Cargo {
        val pack = getPack(deliveryObject)
        val cargo = Cargo(
                          length = pack.length, width = pack.width, height = pack.height, typePackaging = pack.type,
                          netWeight = deliveryObject.weight, grossWeight = deliveryObject.weight + pack.weight
                          )
        return cargo
    }
}

fun taskCargo() {
    val data = readln().split(" ")
    val deliveryObject = DeliveryObject(
                                        length = data[0].toInt(), width = data[1].toInt(), height = data[2].toInt(),
                                        weight = data[3].toDouble()
                                       )
    val warehouse = Warehouse()
    val packCargo = warehouse.packCargo(deliveryObject)
    val cargo = Cargo(
                      length = packCargo.length, width = packCargo.width, height = packCargo.height,
                      typePackaging = packCargo.typePackaging, netWeight = packCargo.netWeight,
                      grossWeight = packCargo.grossWeight
                     )
    cargo.printInfo()
}

fun main() {
    taskCargo()
}