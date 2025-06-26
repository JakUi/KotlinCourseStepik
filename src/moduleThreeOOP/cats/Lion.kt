package moduleThreeOOP.cats

class Lion(
    val animalInPride: Int
 ): CatsFamily() {

    override fun eat() {
        println("I'm eating antelope!..")
    }
}
