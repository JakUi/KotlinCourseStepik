package gui


class Rectangle(
    var width: Int = 0,
    var height: Int = 0
    ) {

    constructor(size: Int): this(size, size)

    constructor(): this(0)

    val area: Int
        get() = width * height

    fun draw() {
        val widthRange = 1..width
        val heightRange = 1 ..height
        for (hr in heightRange) {
            for (wr in widthRange) {
                print("*")
            }
            println()
        }
    }
}
