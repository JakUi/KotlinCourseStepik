package org.example.moduleTwoBaseSyntax

fun main() {
    val password = readln().toCharArray()
    if ('ъ' in password || 'Ъ' in password) {
        println("У вас идеальный пароль!")
    } else {
        println("Опс! В вашем пароле кое-чего не хватает.\n")
    }
}
