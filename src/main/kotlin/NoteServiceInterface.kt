interface NoteServiceInterface<N, C> {

    fun add(note: N): N

    fun createComment(id: Int, comment: C): C

    fun delete(id: Int): Boolean

    fun deleteComment(id: Int): Boolean

    fun edit(id: Int, note: N): Boolean

    fun editComment(id: Int, comment: C): Boolean

    fun get(id: Int)

    fun getById(id: Int)

    fun getComments(id: Int)

    fun restoreComment(id: Int): Boolean
}

//Методы для работы с заметками.
//
 //add
//Создает новую заметку у текущего пользователя.
//
 //createComment
//Добавляет новый комментарий к заметке.
//
 //delete
//Удаляет заметку текущего пользователя.
//
 //deleteComment
//Удаляет комментарий к заметке.
//
 //edit
//Редактирует заметку текущего пользователя.
//
 //editComment
//Редактирует указанный комментарий у заметки.
//
 //get
//Возвращает список заметок, созданных пользователем.
//
 //getById
//Возвращает заметку по её id.
//
 //getComments
//Возвращает список комментариев к заметке.
//
 //getFriendsNotes - Данный метод устарел и может быть отключён через некоторое время, пожалуйста, избегайте его использования.
//Возвращает список заметок друзей пользователя.
//
 //restoreComment
//Восстанавливает удалённый комментарий.


