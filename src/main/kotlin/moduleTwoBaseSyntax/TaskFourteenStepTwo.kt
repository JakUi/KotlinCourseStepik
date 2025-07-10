package org.example.moduleTwoBaseSyntax

fun main() {
    val startOfRange = readln().toInt()
    val endOfRange = readln().toInt()
    val range = startOfRange..endOfRange step 8
    for (r in range) {
        println(r)
    }
}
