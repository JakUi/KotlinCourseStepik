package moduleTwoBaseSyntax

fun main() {
    val age = readln().toLong()
    val seconds: Long = age * 365 * 24 * 60 * 60
    println(seconds)
}