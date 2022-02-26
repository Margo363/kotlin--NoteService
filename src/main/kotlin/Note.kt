data class Note(
    var id: Int,
    var ownerId: Int,
    val title: String,
    val text: String,
    val date: Int,
    var deleted: Boolean = false
) {
    override fun toString(): String {
        return """Note: (ownerId = $ownerId, id = $id, title = '$title', text = '$text', date = $date,deleted = $deleted)"""
    }
}

//    id
//       integer
//       Идентификатор заметки.

//    owner_id
//       integer
//       Идентификатор владельца заметки.

//    title
//       string
//       Заголовок заметки.

//    text
//       string
//       Текст заметки.

//    date
//       integer
//       Дата создания заметки в формате Unixtime.

  // //    comments
//       integer
//       Количество комментариев.

  // //    read_comments
//       integer
//       Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).

  // //    view_url
//       string
//       URL страницы для отображения заметки.

  // //    privacy_view
//       string
//       Настройки приватности комментирования заметки

  // //    can_comment
//       integer
//       Есть ли возможность оставлять комментарии

  // //    text_wiki
//       string
//       Тэги ссылок на wiki