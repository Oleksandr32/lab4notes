package com.oleksandrlysun.lab4notes.presentation.screens.notes

import com.oleksandrlysun.lab4notes.entities.Note

interface NotesView {

    fun setNotes(notes: List<Note>)
}