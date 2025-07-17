package org.example.moduleFiveFunctionalProgramming

/**
 * Класс для представления пользователя.
 */
data class User(val name: String, val email: String?)

/**
 * Отправляет сообщение на указанный email.
 * Реализация метода дана для примера.
 */
fun sendEmail(email: String) {
    println("Сообщение отправлено на $email")
}

/**
 * Проверяет email пользователя и вызывает sendEmail, если email не null.
 *
 * @param user объект пользователя с возможным отсутствующим email.
 */
fun processUserEmail(user: User) {
    // Если email не равен null, функция должна вызвать метод отправки сообщения (sendEmail), передавая этот email как параметр.
    user.email?.let { sendEmail(it) }
}
