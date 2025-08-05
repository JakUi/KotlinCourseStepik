package org.example.moduleSixDesignPatterns


fun task() : Product {
    val product = Product.Builder()
        .name("Smartphone")
        .price(999.99)
        .manufacturer("TechCorp")
        .warranty(24)
        .build()

        return product
}
// Создаваемый объект должен соответствовать следующим параметрам:
//
//Название: "Smartphone"
//Цена: 999.99
//Производитель: "TechCorp"
//Гарантия: 24
//Для этого используйте следующие методы класса Product.Builder:
//
//name(name: String): Builder
//price(price: Double): Builder
//manufacturer(manufacturer: String): Builder
//warranty(months: Int): Builder
//build(): Product
//Создайте объект Product, используя данные методы, установите все параметры и передайте его в переменную product.