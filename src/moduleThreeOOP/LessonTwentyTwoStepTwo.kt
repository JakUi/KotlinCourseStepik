package moduleThreeOOP


interface Transformable {

    fun transform(data: String): String
}

abstract class DataProcessor(val processorName: String) {

    fun process(data: String): String {
        return "Обработчик: $processorName обработал данные"
    }
}

class Encryptor : DataProcessor("Encryptor"), Transformable {

    override fun transform(data: String): String {
        return "$processorName преобразовал данные: encoded_$data"
    }
}

class Compressor : DataProcessor("Compressor"), Transformable {

    override fun transform(data: String): String {
        return "$processorName преобразовал данные: compressed_$data"
    }
}

class Logger: DataProcessor("Logger") {
}
