package moduleThreeOOP


data class Order(
    val id: Int,
    val status: String,
    val type: String
)

fun removeCompletedOrders(orders: List<Order>, typeToRemove: String): List<Order> {
    val ordersWithoutCompleted = mutableListOf<Order>()
    for (order in orders) {
        ordersWithoutCompleted.add(order)
    }

    for (order in orders) {
        if (order.type == typeToRemove && order.status == "completed") {
            ordersWithoutCompleted.remove(order)
        }
    }
    return ordersWithoutCompleted
}

fun main() {
    val orders = listOf(Order(1, "completed","furniture"), Order(2, "completed","furniture"))
    println(removeCompletedOrders(orders, "furniture"))
}
