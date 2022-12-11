package com.practice.paging.domain.posting.domain.service

import com.practice.paging.domain.posting.domain.presenation.dto.response.PostingListResDto
import org.springframework.data.domain.Pageable

interface GetAllPostingService {
    fun execute(pageable: Pageable): PostingListResDto
    fun execute(): PostingListResDto
}