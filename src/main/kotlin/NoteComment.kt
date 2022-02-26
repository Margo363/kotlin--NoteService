data class NoteComment (
    var noteId: Int = 0,
    var ownerId: Int =0,
    val message: String = "",
    var commentId: Int = 0,
    var deleted: Boolean = true
) {
    override fun toString(): String {
        return """Comment: (noteId = $noteId, ownerId = $ownerId, commentId = $commentId, deleted = $deleted
            |   message = '$message')""".trimMargin()
    }
}

 //note_id
//positive
//Идентификатор заметки.
//
 //owner_id
//positive
//Идентификатор владельца заметки.
//
  // //reply_to
//positive
//Идентификатор пользователя, ответом на комментарий которого является добавляемый комментарий (не передаётся, если комментарий не является ответом).
//
 //message
//string
//Текст комментария.
//
 //comment_id
//positive
//Идентификатор комментария.
//
  // //guid
//string
//Уникальный идентификатор, предназначенный для предотвращения повторной отправки одинакового комментария.