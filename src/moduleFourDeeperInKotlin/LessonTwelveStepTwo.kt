package moduleFourDeeperInKotlin

data class UserData(
    val name: String?,
    val email: String?,
    val age: Int?
)

interface Repository {
    /**
     * Возвращает список пользователей, некоторые элементы или их поля могут быть null.
     */
    fun getUsers(): List<UserData?>
}

//class UserViewModel(private val repository: Repository) {
//
//    /**
//     * Реализуйте метод getUserDescriptions, который:
//     * 1. Получает данные из репозитория.
//     * 2. Удаляет null элементы списка.
//     * 3. Заменяет null значения в полях name, email и age на дефолтные.
//     * name: String? → "Unknown Name"
//     * email: String? → "Unknown Email"
//     * age: Int? → 0
//     * 4. Формирует строки в формате: "Name: [name], Email: [email], Age: [age]".
//     *
//     * @return Список строк с описаниями пользователей.
//     */
//    fun getUserDescriptions(): List<String> {
//
//        val userData = repository.getUsers()
//        val parsedData = mutableListOf<String>()
//        for (data in userData) {
//            if (data != null) {
//                val name = if (data.name != null) {
//                    data.name
//                } else {
//                    "Unknown Name"
//                }
//                val email = if (data.email == null) {
//                    "Unknown Email"
//                } else {
//                     data.email
//                }
//                val age = if (data.age == null) {
//                    0
//                } else {
//                    data.age
//                }
//                val updatedData = UserData(name, email, age)
//                parsedData.add("Name: ${updatedData.name}, Email: ${updatedData.email}, Age: ${updatedData.age}")
//            }
//        }
//        return parsedData
//    }
//}

class UserViewModel(private val repository: Repository) {

    /**
     * Реализуйте метод getUserDescriptions, который:
     * 1. Получает данные из репозитория.
     * 2. Удаляет null элементы списка.
     * 3. Заменяет null значения в полях name, email и age на дефолтные.
     * name: String? → "Unknown Name"
     * email: String? → "Unknown Email"
     * age: Int? → 0
     * 4. Формирует строки в формате: "Name: [name], Email: [email], Age: [age]".
     *
     * @return Список строк с описаниями пользователей.
     */
    fun getUserDescriptions(): List<String> {

        val userData = repository.getUsers()
        val parsedData = mutableListOf<String>()
        for (data in userData) {
            if (data != null) {
                val newData = StringBuilder()
                val name = if (data.name == null) {
                    "Unknown Name"
                } else {
                    data.name
                }
                newData.append("Name: $name, ")
                val email = if (data.email == null) {
                    "Unknown Email"
                } else {
                     data.email
                }
                newData.append("Email: $email, ")
                val age = if (data.age == null) {
                    0
                } else {
                    data.age
                }
                newData.append("Age: $age")
                parsedData.add(newData.toString())
            }
        }
        return parsedData
    }
}
