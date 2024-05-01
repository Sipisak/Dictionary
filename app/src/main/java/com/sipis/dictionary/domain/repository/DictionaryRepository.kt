package com.sipis.dictionary.domain.repository

import com.sipis.dictionary.domain.model.WordItem
import com.sipis.dictionary.util.Result
import kotlinx.coroutines.flow.Flow



interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}