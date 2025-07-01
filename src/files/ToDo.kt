package files

import java.io.File

fun main() {
    val operationCode = OperationCode.entries
    val file = File("todo_list.txt")
    while (true) {
        print("Enter operation code (0 - ${operationCode[0].title}, 1 - ${operationCode[1].title}," +
                " 2 - ${operationCode[2].title}): ")
        val operationIndex = readln().toInt()
        val operation = operationCode[operationIndex]
        when (operation) {
            OperationCode.EXIT -> break
            OperationCode.ADD_NEW -> {
                print("Enter task: ")
                val task = readln()
                file.appendText("$task\n")
            }
            OperationCode.PRINT_ALL -> {
                val content = file.readText().trim()
                val items = content.split("\n")
                for ((index, line) in items.withIndex()) {
                    println("$index - $line")
                }
            }
        }
    }
}
