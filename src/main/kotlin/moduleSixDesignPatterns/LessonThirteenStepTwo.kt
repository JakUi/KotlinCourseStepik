package org.example.moduleSixDesignPatterns

import java.util.concurrent.LinkedBlockingDeque
import kotlin.concurrent.thread

class Light {
    fun turnOn() = println("Свет включен")
    fun turnOff() = println("Свет выключен")
}

class TV {
    fun turnOn() = println("Телевизор включен")
    fun turnOff() = println("Телевизор выключен")
    fun changeChannel(channel: Int) = println("Канал переключен на $channel")
}

class AirConditioner {
    fun turnOn() = println("Кондиционер включен")
    fun turnOff() = println("Кондиционер выключен")
    fun setTemperature(temp: Int) = println("Температура установлена на $temp°C")
}
// Создать interface Command, который будет определять метод execute().
interface Command {

    fun execute()
}

//Создать interface Invoker<T : Command>, который должен содержать метод executeCommand(command: T).
interface Invoker<T: Command> {

    fun executeCommand(command: T)
}

// Создать sealed interface DeviceCommand, наследующий Command, который будет использоваться для команд управления
// устройствами. Команды должны быть объявлены внутри sealed interface в фигурных скобках {} как вложенные классы
sealed interface DeviceCommand : Command {

// LightOnCommand(light: Light)
// LightOffCommand(light: Light)
// TVOnCommand(tv: TV)
// TVOffCommand(tv: TV)
// TVChangeChannelCommand(tv: TV, channel: Int)
// AirConditionerOnCommand(ac: AirConditioner)
// AirConditionerOffCommand(ac: AirConditioner)
// AirConditionerSetTempCommand(ac: AirConditioner, temp: Int)

    data class LightOnCommand(
        val light: Light
    ) : DeviceCommand {
        override fun execute() {
            light.turnOn()
        }
    }

    data class LightOffCommand(
        val light: Light
    ) : DeviceCommand {
        override fun execute() {
            light.turnOff()
        }
    }

    data class TVOnCommand(
        val tv: TV
    ) : DeviceCommand {
        override fun execute() {
            tv.turnOn()
        }
    }

    data class TVOffCommand(
        val tv: TV
    ) : DeviceCommand {
        override fun execute() {
            tv.turnOff()
        }
    }

    data class TVChangeChannelCommand(
        val tv: TV,
        val channel: Int
    ) : DeviceCommand {
        override fun execute() {
            tv.changeChannel(channel)
        }
    }

    data class AirConditionerOnCommand(
        val ac: AirConditioner
    ) : DeviceCommand {
        override fun execute() {
            ac.turnOn()
        }
    }

    data class AirConditionerOffCommand(
        val ac: AirConditioner
    ) : DeviceCommand {
        override fun execute() {
            ac.turnOff()
        }
    }

    data class AirConditionerSetTempCommand(
        val ac: AirConditioner,
        val temp: Int
    ) : DeviceCommand {
        override fun execute() {
            ac.setTemperature(temp)
        }
    }

}

// Создать класс RemoteControl, реализующий Invoker<DeviceCommand>, который автоматически выполняет команды в фоновом потоке с BlockingQueue и take().

class RemoteControl : Invoker<DeviceCommand> {

    private val commands = LinkedBlockingDeque<Command>()

    init {
        thread {
            while (true) {
                val command = commands.take()
                command.execute()
            }
        }
    }

    override fun executeCommand(command: DeviceCommand) {
        commands.add(command)
    }
}

fun runCommandTest() {
    val light = Light()
    val tv = TV()
    val ac = AirConditioner()
    val remoteControl = RemoteControl()

    remoteControl.executeCommand(DeviceCommand.LightOnCommand(light))
    remoteControl.executeCommand(DeviceCommand.TVOnCommand(tv))
    remoteControl.executeCommand(DeviceCommand.TVChangeChannelCommand(tv, 5))
    remoteControl.executeCommand(DeviceCommand.AirConditionerOnCommand(ac))
    remoteControl.executeCommand(DeviceCommand.AirConditionerSetTempCommand(ac, 22))
    remoteControl.executeCommand(DeviceCommand.LightOffCommand(light))
    remoteControl.executeCommand(DeviceCommand.TVOffCommand(tv))
    remoteControl.executeCommand(DeviceCommand.AirConditionerOffCommand(ac))
}

fun main() {
    runCommandTest()
}