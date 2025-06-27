package moduleThreeOOP.corporation


fun main() {
    val accountant = Accountant(3,"Konstantin", 37 )
    val employees = accountant.loadAllEmployees()
     for (employee in employees) {
         if (employee is Cleaner) {
             employee.clean()
         }
         if (employee is Supplier) {
             employee.buyThings()
         }
//        employee.work()
    }
}
