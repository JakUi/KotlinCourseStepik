package moduleFiveFunctionalProgramming

//import kotlinx.serialization.Serializable
//import kotlinx.serialization.json.Json
//
//
//// Класс User, который необходимо сериализовать и десериализовать
//@Serializable
//data class User(
//    val id: Int,
//    val name: String,
//    val email: String,
//    val registeredAt: String
//)
//
//// Реализуйте эту функцию для сериализации объекта User
//fun serializeUser(user: User): String {
//    return Json.encodeToString(user)
//}
//
//// Реализуйте эту функцию для десериализации строки JSON в объект User
//fun deserializeUser(json: String): User {
////    val deserialized = Json.decodeToString(json)
//    val str = Json.decodeFromString<User>(json)
////    return User(0, "", "", "")
//    return str
//}
//
//fun main() {
//    val user = User(1, "Hon", "alkawtan@gmail.com", "Long time age")
//    val json = serializeUser(user)
//    val str = deserializeUser(json)
//    print(str)
//}
