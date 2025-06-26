package moduleThreeOOP.cats

fun main() {
    val cat = Cat("Morris")
    val lion = Lion(7)
    val animals = listOf<CatsFamily>(cat, lion)
    for (animal in animals) {
        animal.eat()
    }
}
