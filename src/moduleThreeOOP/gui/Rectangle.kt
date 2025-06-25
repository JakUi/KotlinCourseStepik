package moduleThreeOOP.gui

//class Rectangle {
//    val width: Int
//    val height: Int
//
//    constructor(width: Int, height: Int) {
//        this.width = width
//        this.height = height
//
//    }
//
////     constructor(size: Int) {
////        this.width = size
////        this.height = size
////
////    }
//
//    constructor(size: Int): this(size, size)
//
//    constructor() {
//        this.width = 0
//        this.height = 0
//    }
//
//    fun draw() {
//        val widthRange = 1..width
//        val heightRange = 1 ..height
//        for (hr in heightRange) {
//            for (wr in widthRange) {
//                print("*")
//            }
//            println()
//        }
//    }
//}

class Rectangle(
    val width: Int = 0,
    val height: Int = 0
    ) {

    constructor(size: Int): this(size, size)

    constructor(): this(0)

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
