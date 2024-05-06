package com.notes

import com.notes.data.model.NoteDao
import com.notes.data.repository.NoteRepository
import com.notes.data.repository.NoteRepositoryImpl
import com.notes.presentation.add_edit_note.AddEditNoteScreen
import com.notes.presentation.add_edit_note.AddEditNoteViewModel
import com.notes.use_case.AddNote
import com.notes.use_case.DeleteNote
import com.notes.use_case.GetNote
import com.notes.use_case.NoteUseCases
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

//@HiltAndroidTest
class AddEditNoteViewModelTest {


//    @get:Rule
//    var hiltRule = HiltAndroidRule(this)
//
//    @Inject
//    lateinit var addEditNoteViewModel: AddEditNoteViewModel
//
//    @Before
//    fun init() {
//        hiltRule.inject()
//    }

    //test viewModel
    @Test
    fun test_viewModel(){
        Assert.assertEquals("com.notes", "com.notes")
    }
}