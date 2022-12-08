package com.practice.paging.domain.posting.domain.service

import com.practice.paging.domain.posting.domain.entity.Posting
import com.practice.paging.domain.posting.domain.presenation.dto.request.PostingWriteReqDto

interface PostingWriteService {
    fun execute(postingReqDto: PostingWriteReqDto): Posting
}