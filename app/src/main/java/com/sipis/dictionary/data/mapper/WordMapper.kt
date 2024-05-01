package com.sipis.dictionary.data.mapper

import com.sipis.dictionary.data.dto.DefinitionDto
import com.sipis.dictionary.data.dto.MeaningDto
import com.sipis.dictionary.data.dto.WordItemDto
import com.sipis.dictionary.domain.model.Definition
import com.sipis.dictionary.domain.model.Meaning
import com.sipis.dictionary.domain.model.WordItem



fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)


fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)














