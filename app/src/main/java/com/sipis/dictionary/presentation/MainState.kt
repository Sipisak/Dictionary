package com.sipis.dictionary.presentation

import com.sipis.dictionary.domain.model.WordItem


data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)
