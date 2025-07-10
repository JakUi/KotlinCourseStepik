package org.example.corporation


fun main() {
    val director = WorkersRepository.findDirector() ?: throwDirectorIsRequired()
    director.printInfo()
}
fun throwDirectorIsRequired(): Nothing {
    throw IllegalStateException("Director is required for this program. Please add it to the file workers.txt")
}
