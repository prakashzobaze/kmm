package com.zobaze.notesapp.domain.note

import com.zobaze.notesapp.presentation.BabyBlueHex
import com.zobaze.notesapp.presentation.LightGreenHex
import com.zobaze.notesapp.presentation.RedOrangeHex
import com.zobaze.notesapp.presentation.RedPinkHex
import com.zobaze.notesapp.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}