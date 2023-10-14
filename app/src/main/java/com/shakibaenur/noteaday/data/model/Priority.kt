package com.shakibaenur.noteaday.data.models

import androidx.compose.ui.graphics.Color
import com.shakibaenur.noteaday.ui.theme.HighPriorityColor
import com.shakibaenur.noteaday.ui.theme.LowPriorityColor
import com.shakibaenur.noteaday.ui.theme.MediumPriorityColor
import com.shakibaenur.noteaday.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}