package com.gemini_kotlin_app

import com.gemini_kotlin_app.model.Chat
import android.graphics.Bitmap

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)