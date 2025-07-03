package corporation

abstract class Worker(
    val id: Int,
    val name: String,
    val age: Int = 0,
    val salary: Int = 15000,
    val position: Position
) {

    abstract fun work()

    abstract fun copy(salary: Int = this.salary, age: Int = this.age): Worker

    fun printInfo() {
        println(this)
    }


    override fun toString(): String {
        return "Id: $id Name: $name Age: $age Position: $position Salary: $salary"
    }
}
