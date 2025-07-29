package org.example.moduleSixDesignPatterns


// Хранилище пользователей
class UserRepository {
    private val users = mutableListOf<String>()

    // Добавить список подписчиков (наблюдателей) UserLogger
    private val observers = mutableListOf<UserLogger>()

    fun addUser(user: String) {
        users.add(user)
        notifyObservers() // уведомить подписчиков об изменении списка пользователей
    }

    fun removeUser(user: String) {
        users.remove(user)
        notifyObservers()
    }

    // Реализовать метод подписки
    // Реализовать метод подписки subscribe(logger: UserLogger), который добавляет новый объект UserLogger в список подписчиков
    // и сразу уведомляет его (logger) о текущем состоянии списка пользователей.
    fun subscribe(logger: UserLogger) {
        observers.add(logger)
        logger.onUsersChanged(users)
    }

    // Реализовать метод отписки
    fun unsubscribe(logger: UserLogger) {
        observers.remove(logger)
    }

    // Реализовать метод уведомления подписчиков
    private fun notifyObservers() {
        for (observer in observers) {
            observer.onUsersChanged(users)
        }
    }
}

// Класс наблюдателя, который подписывается на изменения в UserRepository
class UserLogger {
    // Реализовать метод onUsersChanged(), который выводит сообщение в консоль в формате:
    fun onUsersChanged(users: List<String>) {
        println("[LOG] Пользователи обновлены: $users")
    }
}