package org.example.moduleFourDeeperInKotlin

enum class LogLevel {
    TRACE, DEBUG, INFO, WARN, ERROR, FATAL
}

class Config {
    var timeout: Int = 30
        //  Если при установке передается значение меньше 1 или больше 300,
        // сеттер должен устанавливать значение по умолчанию 30 и выводить
        // сообщение "Ошибка: Время ожидания должно быть в диапазоне от 1 до 300 секунд. Установлено значение по умолчанию.".
        set(value: Int) {
            if (value < 1 || value > 300) {
                println("Ошибка: Время ожидания должно быть в диапазоне от 1 до 300 секунд. Установлено значение по умолчанию.")
            } else {
                field = value
            }

        }
    var maxRetries: Int = 3
        set(value) {
            if (value < 0) {
                println("Ошибка: Максимальное количество повторных попыток не может быть отрицательным. Установлено значение по умолчанию.")
            } else {
                field = value
            }
        }

    var loggingLevel: LogLevel = LogLevel.INFO
        set(value) {
            if (value == LogLevel.TRACE) {
                println("Ошибка: Уровень ${LogLevel.TRACE} недоступен.")
            } else if (value == LogLevel.FATAL) {
                println("Ошибка: Уровень ${LogLevel.FATAL} недоступен.")
            }
            else {
                field = value
            }
        }

    val isDebugMode: Boolean // возвращает true, если loggingLevel установлен на LogLevel.DEBUG, и false в противном случае.
        get(): Boolean {
            if (loggingLevel == LogLevel.DEBUG) {
                return true
            } else {
                return false
            }
        }

    val isProductionMode: Boolean // возвращает true, если loggingLevel установлен на LogLevel.ERROR, и false в противном случае.
        get(): Boolean {
            if (loggingLevel == LogLevel.ERROR) {
                return true
            } else {
                return false
            }
        }

    fun printConfig() {
        println("Время ожидания: $timeout секунд")
        println("Максимальное количество повторных попыток: $maxRetries")
        println("Уровень логирования: $loggingLevel")
        println("Режим отладки: $isDebugMode")
        println("Режим продакшн: $isProductionMode")
    }
}
