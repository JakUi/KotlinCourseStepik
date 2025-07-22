package org.example.moduleSixDesignPatterns


import kotlin.concurrent.thread


class ThreadRunner {
    fun runThreads(): Map<String, String> {
        val threadInfo = mutableMapOf<String, String>()
        threadInfo[Thread.currentThread().name] = "Главный поток, который управляет выполнением"
        thread {
            threadInfo[Thread.currentThread().name] = "Выполняет вычисления 1"
        }.join()
        thread {
            threadInfo[Thread.currentThread().name] = "Выполняет вычисления 2"
        }.join()
        thread {
            threadInfo[Thread.currentThread().name] = "Выполняет вычисления 3"
        }.join()

        return threadInfo
    }
}

fun main() {
    val threadRunner = ThreadRunner()
    println( threadRunner.runThreads())
}