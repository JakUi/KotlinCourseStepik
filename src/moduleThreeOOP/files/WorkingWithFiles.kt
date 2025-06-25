package moduleThreeOOP.files

import java.io.File

fun main() {
    val file = File("test.txt")
//    file.writeText("Hello")
    file.appendText("World!!!")
}
