package com.practice.paging.domain.posting.domain.service.impl

import com.practice.paging.domain.posting.domain.entity.Posting
import com.practice.paging.domain.posting.domain.presenation.dto.request.PostingWriteReqDto
import com.practice.paging.domain.posting.domain.repository.PostingRepository
import com.practice.paging.domain.posting.domain.service.PostingWriteService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(rollbackFor = [Exception::class])
class PostingWriteServiceImpl(
    private val postingRepository: PostingRepository,
): PostingWriteService{
    override fun execute(postingReqDto: PostingWriteReqDto): Posting =
        postingRepository.save(postingReqDto.toEntity())
}