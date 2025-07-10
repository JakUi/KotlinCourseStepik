package org.example.moduleTwoBaseSyntax

fun main(){
    val firstPersonAge: Int = readln().toInt()
    val secondPersonAge: Int = readln().toInt()

    if (firstPersonAge > secondPersonAge) {
        println("First person is older than second person")
    }
    else if (firstPersonAge < secondPersonAge) {
        println("Second person is older than first person")
    }
    else {
        println("Both persons are the same age.")
    }
}
