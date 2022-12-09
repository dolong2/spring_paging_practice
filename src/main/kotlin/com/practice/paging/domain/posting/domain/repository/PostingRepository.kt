package com.practice.paging.domain.posting.domain.repository

import com.practice.paging.domain.posting.domain.entity.Posting
import org.springframework.data.jpa.repository.JpaRepository

interface PostingRepository: JpaRepository<Posting, String>