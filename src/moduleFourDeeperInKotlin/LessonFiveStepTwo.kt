package moduleFourDeeperInKotlin

// Settings.kt
object Settings {
    var language: String = "English"
    var theme: String = "Light"
    var notificationsEnabled: Boolean = true

    fun applySettings() {
        println("Применение настроек: язык - $language, тема - $theme, уведомления - ${if (notificationsEnabled) "включены" else "выключены"}")
    }
}

// UIComponent.kt
class UIComponent {
    private val settings = Settings

    fun updateLanguage(newLanguage: String) {
        settings.language = newLanguage
        println("UIComponent: язык изменен на $newLanguage")
        settings.applySettings()
    }

    // Метод для получения текущего значения языка
    fun getSettingsLanguage(): String {
        return settings.language
    }

    // Метод для получения текущего статуса уведомлений
    fun getSettingsNotificationsEnabled(): Boolean {
        return settings.notificationsEnabled
    }
}

// NotificationComponent.kt
class NotificationComponent {
    private val settings = Settings

    fun toggleNotifications(enable: Boolean) {
        settings.notificationsEnabled = enable
        println("NotificationComponent: уведомления ${if (enable) "включены" else "выключены"}")
        settings.applySettings()
    }

    // Метод для получения текущего значения языка
    fun getSettingsLanguage(): String {
        return settings.language
    }

    // Метод для получения текущего статуса уведомлений
    fun getSettingsNotificationsEnabled(): Boolean {
        return settings.notificationsEnabled
    }
}


// Application.kt
class Application {
    private val uiComponent = UIComponent()
    private val notificationComponent = NotificationComponent()

    fun run() {
        uiComponent.updateLanguage("Spanish")
        notificationComponent.toggleNotifications(false)
    }
}
