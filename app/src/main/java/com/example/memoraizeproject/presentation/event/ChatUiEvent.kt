package com.example.memoraizeproject.presentation.event

import android.graphics.Bitmap

sealed class ChatUiEvent {
    data class UpdatePrompt(val newPrompt: String) : ChatUiEvent()

    data class SendPrompt(
        val prompt: String,
        val bitmap: Bitmap?,
    ) : ChatUiEvent()

    // show indicator
    data object ShowIndicator : ChatUiEvent()
}
