package com.practice.paging.domain.posting.domain.service

import com.practice.paging.domain.posting.domain.presenation.dto.response.PostingListResDto
import java.awt.print.Pageable

interface GetAllPostingService {
    fun execute(pageable: Pageable): PostingListResDto
}