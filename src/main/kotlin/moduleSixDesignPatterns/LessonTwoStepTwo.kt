package org.example.moduleSixDesignPatterns

// Ваша задача — сделать этот класс Singleton
class SettingsManager private constructor(context: Context) : BaseManager(context) {

    private val settings: MutableMap<String, String> = mutableMapOf()

    init {
        settings.putAll(context.defaultSettings)
    }

    fun getSetting(key: String): String? {
        return settings[key]
    }

    companion object {
        private var instance: SettingsManager? = null
        fun getInstance(context: Context): SettingsManager {
            if (instance == null) {
                instance = SettingsManager(context)
            }
            return instance!!
        }
    }
}

open class BaseManager(val context: Context)

data class Context(val name: String, val defaultSettings: Map<String, String>)
