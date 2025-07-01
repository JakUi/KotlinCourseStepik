package files

import java.io.File

fun main() {
    val file = File("test.txt")
//    fileProductCards.writeText("Hello")
    file.appendText("World!!!")
}
