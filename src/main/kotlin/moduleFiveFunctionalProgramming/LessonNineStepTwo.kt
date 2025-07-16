package org.example.moduleFiveFunctionalProgramming

/**
 * Класс для представления информации о продукте.
 *
 * @property id Уникальный идентификатор продукта.
 * @property name Название продукта.
 * @property price Цена продукта.
 * @property category Категория продукта.
 */
data class Product2(
    val id: Int,
    val name: String,
    val price: Double,
    val category: String
)

/**
 * Метод, который обрабатывает список продуктов для отображения в UI.
 *
 * @param products Список продуктов, полученных из репозитория.
 * @return Список строк, готовых для отображения в UI.
 */
fun processProductsForUI(products: List<Product2>): List<String> {

    return products
        .filter { it.price > 100 }
        .filter { it.category == "Electronics" || it.category == "Books" }
        .sortedBy { it.price }
        .map { "Product ID: ${it.id} | Name: ${it.name} | Price: $${it.price}" }
}

fun main() {

    val products = listOf(
        Product2(1, "Laptop", 999.99, "Electronics"),
        Product2(2, "Notebook", 12.99, "Books"),
        Product2(3, "Tablet", 299.99, "Electronics"),
        Product2(4, "Novel", 15.49, "Books"),
        Product2(5, "Pen", 2.99, "Stationery")
    )

    processProductsForUI(products)
        .forEach { println(it) }
}
