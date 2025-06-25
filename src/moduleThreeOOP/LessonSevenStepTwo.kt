package moduleThreeOOP

import kotlin.random.Random

class Monster {
    val pawsCount: Int
    val eyesCount: Int
    val fangsCount: Int
    val clawsCount: Int
    val tentaclesCount: Int

    constructor(pawsCount: Int, eyesCount: Int, fangsCount: Int, clawsCount: Int, tentaclesCount: Int) {
        this.pawsCount = pawsCount
        this.eyesCount = eyesCount
        this.fangsCount = fangsCount
        this.clawsCount = clawsCount
        this.tentaclesCount = tentaclesCount
    }

    constructor(count: Int) {
        this.pawsCount = count
        this.eyesCount = count
        this.fangsCount = count
        this.clawsCount = count
        this.tentaclesCount = count
    }

    constructor() {
        this.pawsCount = Random.nextInt(1, 10)
        this.eyesCount = Random.nextInt(1, 10)
        this.fangsCount = Random.nextInt(1, 10)
        this.clawsCount = Random.nextInt(1, 10)
        this.tentaclesCount = Random.nextInt(1, 10)
    }

    fun printInfo() {
        println("Кол-во лап: $pawsCount")
        println("Кол-во глаз: $eyesCount")
        println("Кол-во клыков: $fangsCount")
        println("Кол-во когтей: $clawsCount")
        println("Кол-во щупалец: $tentaclesCount")
    }
}

fun main() {
    fun task() {
        val data = readln().split(" ")
        val monster = Monster(pawsCount = data[0].toInt(), eyesCount = data[1].toInt(), fangsCount = data[2].toInt(),
            clawsCount = data[3].toInt(), tentaclesCount = data[4].toInt())
        monster.printInfo()
    }

    task()
}
