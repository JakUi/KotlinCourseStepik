package moduleThreeOOP
//
//// Класс для логирования событий
//class LogEvent(val eventData: Any) {
//
//    private val date: String = getCurrentDate()
//
//    // вам понадобится этот метод чтобы получить текущую дату и время
//    private fun getCurrentDate(): String {
//        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//        return dateFormat.format(Date())
//    }
//
//    override fun toString(): String {
//        // Переопределите метод toString() таким образом, чтобы он возвращал строку в формате:
//        //[date]: eventData
//        return "[$date]: $eventData"
//    }
//}
//
//// Перечисление действий пользователя
//enum class UserAction(val title: String) {
//
//    LOGIN("LOGIN"), LOGOUT("LOGOUT"), CLICK_BUTTON("CLICK_BUTTON"), VIEW_PAGE("VIEW_PAGE");
//
//    override fun toString(): String {
//        return "UserAction: $title" // toString(): возвращает строковое представление действия в формате: UserAction: LOGIN
//    }
//}
