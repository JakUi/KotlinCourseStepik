package exceptions

fun main() {
//    try {
//        val a = readln().toInt()
//        val b = readln().toInt()
//        println(a / b)
//    } catch (exception: ArithmeticException) {
//        println("You can't divide by zero")
//    } catch (exception: NumberFormatException) {
//        println("Wrong input")
//    } catch (exception: Throwable) {
//        println("Common error")
//    }
//    println("After try-catch")

    val testArray = listOf(1, 2, 3, 4, 5, 6)
    try {
        println( testArray[6])
    } catch (ex: IndexOutOfBoundsException) {
        println("Index out of bounds exception was caught")
    }
}
