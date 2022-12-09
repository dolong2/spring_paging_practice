package com.practice.paging.domain.posting.domain.repository

import com.practice.paging.domain.posting.domain.entity.Posting
import org.springframework.data.domain.Page
import org.springframework.data.jpa.repository.JpaRepository
import java.awt.print.Pageable

interface PostingRepository: JpaRepository<Posting, String> {
    fun findAll(pageable: Pageable): Page<Posting>
}