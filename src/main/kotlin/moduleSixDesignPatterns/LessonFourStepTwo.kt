package org.example.moduleSixDesignPatterns

class DatabaseConnection private constructor() {

    companion object {
        private var instance: DatabaseConnection? = null
        private val lock = Any()

        fun getInstance(): DatabaseConnection {
            instance?.let {
                return it
            }
            synchronized(lock) {
                instance?.let {
                    return it
                }
                return DatabaseConnection().also {
                    instance = it
                }
            }
        }
    }

    fun query(sql: String): String {
        return "Результат запроса: $sql"
    }
}
