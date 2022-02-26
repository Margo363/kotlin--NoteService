import NoteService.add
import NoteService.createComment
import NoteService.delete
import NoteService.deleteComment
import NoteService.edit
import NoteService.editComment
import NoteService.get
import NoteService.getById
import NoteService.getComments
import NoteService.restoreComment
import NoteService.comments
import NoteService.notes

fun main(args: Array<String>) {

    val note1 = Note(1,111, "note1", "text1", 11111111, deleted = true)
    val note2 = Note(2,222, "note2", "text2", 22222222, deleted = true)
    val note3 = Note(3,333, "note3", "text3", 33333333, deleted = true)
    val note4 = Note(4,444, "note4", "text4", 44444444, deleted = true)
    val comment1 = NoteComment(1,1,"comment 1", 1, true)
    val comment2 = NoteComment(2,2,"comment 2", 2, true)

    add(note1)
    add(note2)
    add(note3)
    add(note4)

    createComment(1, comment1)
    createComment(4, comment2)

    delete(3)

    deleteComment(1)

    get(5)

    getById(1)

    getComments(4)

    restoreComment(1)

}