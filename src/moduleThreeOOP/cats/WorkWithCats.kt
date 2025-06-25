package moduleThreeOOP.cats

fun main() {
    val cat = Cat("Morris")
    println(cat.legsCount)
    println(cat.name)
    val lion = Lion(7)
    println("${lion.legsCount} ${lion.animalInPride}")
    cat.playWithMouse()
}
