package com.practice.paging.domain.posting.domain.presenation.dto.response

import com.practice.paging.domain.posting.domain.entity.Posting
import java.time.LocalDate

class PostingResDto(
    val id: String,
    val title: String,
    val content: String,
    val date: LocalDate,
){
    constructor(posting: Posting):this(
        id = posting.id,
        title = posting.title,
        content = posting.content,
        date = posting.date,
    )
}