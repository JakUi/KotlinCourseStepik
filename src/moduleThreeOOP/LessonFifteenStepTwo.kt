package moduleThreeOOP

fun taskFifteen(listUser: List<String>): List<String> {
    val users = mutableListOf<String>()
    for (user in listUser) {
        users.add(user)
    }

    fun printAllUsers() {
        for (user in users) {
            println(user)
        }
    }

    val command = readln().trim()
    when (command) {
        "SHOW" -> {
            printAllUsers()
        }
        "ADD" -> {
            val newItem = readln()
            users.add(newItem)
            printAllUsers()
        }
        "REMOVE" -> {
            val removeItem = readln()
            users.remove(removeItem)
            printAllUsers()
        }
        "REMOVE_AT" -> {
            val removeIndex = readln().toInt()
            users.removeAt(removeIndex)
            printAllUsers()
        }
        else -> print("Некорректное значение")
    }
    return users
}

fun main() {
    val user = listOf<String>("user0", "user1", "user2", "user3", "user4", "user5", "user6", "user7", "user8", "user9")
    taskFifteen(user)
}
