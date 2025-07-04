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

    override fun equals(other: Any?): Boolean {
        if (other !is Worker) {
            return false
        } else if (this.id == other.id && this.name == other.name && this.age == other.age && this.salary == other.salary &&
            this.position == other.position) {
            return true
        } else {
            return false
        }
    }
}
