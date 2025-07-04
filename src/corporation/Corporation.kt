package corporation


fun main() {
    val workers = WorkersRepository.workers
    for (worker in workers) {
        worker.work()
    }
}
// 1 Name: Kseniia Age: 34 Position: DIRECTOR Salary: 230000