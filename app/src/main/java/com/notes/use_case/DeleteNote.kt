package com.notes.use_case

import com.notes.data.model.Note
import com.notes.data.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}