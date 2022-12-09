package com.practice.paging.domain.posting.domain.service.impl

import com.practice.paging.domain.posting.domain.presenation.dto.response.PostingListResDto
import com.practice.paging.domain.posting.domain.presenation.dto.response.PostingResDto
import com.practice.paging.domain.posting.domain.repository.PostingRepository
import com.practice.paging.domain.posting.domain.service.GetAllPostingService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.awt.print.Pageable

@Service
@Transactional(readOnly = true, rollbackFor = [Exception::class])
class GetAllPostingServiceImpl(
    private val postingRepository: PostingRepository,
): GetAllPostingService {
    override fun execute(pageable: Pageable): PostingListResDto =
        PostingListResDto(
            list = postingRepository.findAll(pageable)
            .map { PostingResDto(it) }
            .content
        )
}