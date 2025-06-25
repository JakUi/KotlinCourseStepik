package moduleThreeOOP

class CarWithInit {
    var brand = ""
    var model = ""
    var enginePower = 0
    var bodyColor = ""

    // Добавьте метод init() с параметрами, в котором проинициализируйте свойства класса.
    fun init(brand: String, model: String, enginePower: Int, bodyColor: String) {
        this.brand = brand
        this.model = model
        this.enginePower = enginePower
        this.bodyColor = bodyColor
    }

    fun drive() {
        //измените метод: Пусть метод выводит в консоль надпись:
        //
        //Еду быстро, но недалеко на {марка} {модель}  если мощность автомобиля >= 120л.с.
        //
        //Еду далеко, но небыстро на {марка} {модель}  если мощность автомобиля < 120л.с.
        if (enginePower >= 120) {
            println("Еду быстро, но недалеко на $brand $model")
        } else {
            println("Еду далеко, но небыстро на $brand $model")
        }
    }
}

fun taskWithInit() {
    //создайте здесь экземпляр Car и вызовите у него методы init() и drive()
    val car = CarWithInit()
    val data = readln().split(" ")
    val brand = data[0]
    val model = data[1]
    val enginePower = data[2].toInt()
    val bodyColor = data[3]
    car.init(model = model, brand = brand, enginePower = enginePower, bodyColor = bodyColor)
    car.drive()
}
