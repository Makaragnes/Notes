package com.notes.navigation

sealed class HostConst(val route: String) {
    object NotesScreen: HostConst("notes_screen")
    object AddEditNoteScreen: HostConst("add_edit_note_screen")
}