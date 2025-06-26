package moduleThreeOOP.corporation

open class Worker(
    val id: Int,
    val name: String,
    val age: Int = 0,
    val position: WorkersType
) {
    open fun work() {
        println("I'm working now...")
    }

    open fun printWorkerInfo() {
        println("Id: $id Name: $name Age: $age Position: ${position.title}")
    }
}
