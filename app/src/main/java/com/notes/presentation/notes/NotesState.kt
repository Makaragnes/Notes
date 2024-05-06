package com.notes.presentation.notes

import com.notes.data.model.Note
import com.notes.util.NoteOrder
import com.notes.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)