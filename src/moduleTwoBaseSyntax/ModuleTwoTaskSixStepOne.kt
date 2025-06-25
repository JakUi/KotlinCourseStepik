package moduleTwoBaseSyntax

fun main() {
    val time = readln().toInt()
    val hours: Int
    val minutes: Int
    val seconds: Int
    val secondsInMinute = 60
    hours = time / 3600
    minutes = time % 3600 / 60
    seconds = time % secondsInMinute
    println("$hours hours : $minutes minutes : $seconds seconds")
}
