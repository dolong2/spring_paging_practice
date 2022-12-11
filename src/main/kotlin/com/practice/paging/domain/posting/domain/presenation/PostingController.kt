package com.practice.paging.domain.posting.domain.presenation

import com.practice.paging.domain.posting.domain.presenation.dto.request.PostingWriteReqDto
import com.practice.paging.domain.posting.domain.presenation.dto.response.PostingListResDto
import com.practice.paging.domain.posting.domain.service.GetAllPostingService
import com.practice.paging.domain.posting.domain.service.PostingWriteService
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posting")
class PostingController(
    private val getAllPostingService: GetAllPostingService,
    private val postingWriteService: PostingWriteService,
){

    @PostMapping
    fun writePosting(@RequestBody postingWriteReqDto: PostingWriteReqDto): ResponseEntity<Void>{
        postingWriteService.execute(postingWriteReqDto)
        return ResponseEntity.ok().build()
    }

    @GetMapping("/page")
    fun getAllPosting(pageable: Pageable): ResponseEntity<PostingListResDto> =
        ResponseEntity.ok(getAllPostingService.execute(pageable))

    @GetMapping
    fun getAllPosting(): ResponseEntity<PostingListResDto> =
        ResponseEntity.ok(getAllPostingService.execute())
}