package corporation

abstract class Worker(
    val id: Int,
    val name: String,
    val age: Int = 0,
    private var salary: Int = 15000,
    val position: Position
) {

    fun getSalary(): Int = this.salary // можно переписать так (функция вернёт значение0

    fun setSalary(salary: Int) {
        if (salary < this.salary) {
            println("The new salary is too small...")
        } else {
            this.salary = salary
        }
    }

//        get() {
//            return field
//        }

//    fun setSalary(salary: Int) {
//        if (salary < this.salary ) {
//            println("The salary is too small...")
//        } else {
//            this.salary = salary
//        }
//    }
//
//    fun getSalary(): Int {
//        return this.salary
//    }

    abstract fun work()

    fun printInfo() {
        println(this)
    }


    override fun toString(): String {
        return "Id: $id Name: $name Age: $age Position: $position Salary: $salary"
    }
}
