package com.notes.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.notes.ui.theme.BabyBlue
import com.notes.ui.theme.LightGreen
import com.notes.ui.theme.RedOrange
import com.notes.ui.theme.RedPink
import com.notes.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)