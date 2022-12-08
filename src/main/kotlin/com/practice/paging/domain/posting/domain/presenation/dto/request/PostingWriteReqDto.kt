package com.practice.paging.domain.posting.domain.presenation.dto.request

import com.practice.paging.domain.posting.domain.entity.Posting
import java.time.LocalDate

class PostingWriteReqDto(
    val title: String,
    val content: String,
){
    fun toEntity(): Posting =
        Posting(
            title = title,
            content = content,
            date = LocalDate.now()
        )
}