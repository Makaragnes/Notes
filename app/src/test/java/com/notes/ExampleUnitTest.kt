package com.notes

import com.notes.presentation.add_edit_note.AddEditNoteViewModel
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import javax.inject.Inject

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
//@HiltAndroidTest
class ExampleUnitTest {

//    @get:Rule
//    var hiltRule = HiltAndroidRule(this)

//    @Inject
//    lateinit var addEditNoteViewModel: AddEditNoteViewModel

//    @Before
//    fun init() {
//        hiltRule.inject()
//    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}