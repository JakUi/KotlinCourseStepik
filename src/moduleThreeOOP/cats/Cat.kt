package moduleThreeOOP.cats

class Cat(val name: String): CatsFamily(legsCount =  4) {

    fun playWithMouse() {
        println("I'm playing with mouse")
    }
}