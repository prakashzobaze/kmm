package com.zobaze.notesapp.android.note_list

import com.zobaze.notesapp.domain.note.Note


data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)