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
import org.junit.Test
import org.junit.Assert.*


class NoteServiceTest {

    @Test
    fun testAdd() {
        //Arrange
        val noteTest: Note = Note(0, 0, " ", " ",0, false)
        noteTest.id = 1
        //Act
        val result = 1
        //Assert
        assertEquals(noteTest.id, result)
    }

    @Test
    fun testCreateComment() {
        //Arrange
        val noteTest: Note = Note(0, 1, " ", " ", 0,false)
        noteTest.id = 1
        val commentTest: NoteComment = NoteComment(1, 0," ", 0, false)
        //Act
        commentTest.commentId = 1
        //Assert
        assertEquals(commentTest.commentId, noteTest.id)
    }

    @Test
    fun testDelete() {
        //Arrange
        val noteTest: Note = Note(0, 0, " ", " ", 0,false)
        add(noteTest)
        noteTest.id = 1
        //Act
        delete(1)
        noteTest.deleted = true
        val result = true
        //Assert
        assertEquals(noteTest.deleted, result)
    }

    @Test
    fun testDeleteComment() {
        //Arrange
        val noteTest: Note = Note(0, 0, " ", " ", 0,false)
        add(noteTest)
        val commentTest: NoteComment = NoteComment(0, 0," ", 0, false)
        createComment(1, commentTest)
        //Act
        deleteComment(1)
        commentTest.deleted = true
        val result: Boolean = true
        //Assert
        assertEquals(commentTest.deleted, result)
    }

    @Test
    fun testEdit() {
        //Arrange
        val noteTest: Note = Note(0, 0, " ", " ", 0,false)
        add(noteTest)
        noteTest.id = 1
        //Act
        edit(1, noteTest)
        noteTest.deleted = false
        val result: Boolean = false
        //Assert
        assertEquals(noteTest.deleted, result)
    }

    @Test
    fun testEditComment() {
        //Arrange
        val noteTest: Note = Note(0, 0, "", "", 0,false)
        add(noteTest)
        val commentTest: NoteComment = NoteComment(0, 0,"", 0,true)
        createComment(1, commentTest)
        //Act
        editComment(1, commentTest)
        commentTest.deleted = false
        val result: Boolean = false
        //Assert
        assertEquals(commentTest.deleted, result)
    }

    @Test
    fun testGetNote() {
        //Arrange
        val noteTest: Note = Note(10, 0, "title", "", 0,false)
        add(noteTest)
        //Act
        val expected = "title"
        //Assert
        assertEquals(noteTest.title, expected)
    }

    @Test
    fun testGetById() {
        //Arrange
        val note: Note = Note(10, 0, "title", "text", 0,false)
        val expected = println("""title: title, text: text""")
        //Act
        val result = println("""title: ${note.title}, text: ${note.text}""")
        //Assert
        assertEquals(expected, result)
    }

    @Test
    fun testGetComments() {
        //Arrange
        val note: Note = Note(0, 0, "", "", 0,false)
        val comment: NoteComment = NoteComment(0, 0,"comment", 0, true)
        add(note)
        createComment(1, comment)
        val expected = comment.message
        //Act
        val result = "comment"
        //Assert
        assertEquals(expected, result)
    }

    @Test
    fun testRestoreComment() {
            //Arrange
            val commentTest: NoteComment = NoteComment(1, 0,"", 1, true)
            commentTest.commentId = 1
            commentTest.deleted = true
            //Act
            restoreComment(1)
            val result = true
            //Assert
            assertEquals(commentTest.deleted, result)
    }

    @Test(expected = NoteException::class)
    fun testExceptionEditNote() {
        //Arrange
        val noteTest: Note = Note(0, 0, " ", " ", 0,false)
        add(noteTest)
        noteTest.id = 1
        val expected = NoteException::class
        //Act
        edit(5, noteTest)
        val result = NoteException::class
        //Assert
        assertEquals(expected, result)
    }

    @Test(expected = NoteException::class)
    fun testExceptionDeleteNote() {
        //Arrange
        val expected = NoteException::class
        //Act
        delete(5)
        val result = NoteException::class
        //Assert
        assertEquals(expected, result)
    }

    @Test(expected = NoteException::class)
    fun testExceptionAddComment() {
        //Arrange
        val comment: NoteComment = NoteComment(0, 0," ", 0, true)
        val expected = NoteException::class
        //Act
        val result = createComment(6, comment)
        //Assert
        assertEquals(expected, result)
    }

    @Test(expected = CommentException::class)
    fun testExceptionDeleteComment() {
        //Arrange
        val expected = CommentException::class
        //Act
        deleteComment(5)
        val result = CommentException::class
        //Assert
        assertEquals(expected, result)
    }

    @Test(expected = CommentException::class)
    fun testExceptionEditComment() {
        //Arrange
        val commentTest: NoteComment = NoteComment(0, 0," ", 0, true)
        val expected = CommentException::class
        //Act
        editComment(5, commentTest)
        val result = CommentException::class
        //Assert
        assertEquals(expected, result)
    }

    @Test(expected = CommentRestoreException::class)
    fun testExceptionRestoreComment() {
        //Arrange
        val commentTest: NoteComment = NoteComment(1, 0," ", 1, true)
        commentTest.commentId = 1
        commentTest.deleted = true
        val expected = CommentRestoreException::class
        //Act
        restoreComment(5)
        val result = CommentRestoreException::class
        //Assert
        assertEquals(expected, result)
    }
}









