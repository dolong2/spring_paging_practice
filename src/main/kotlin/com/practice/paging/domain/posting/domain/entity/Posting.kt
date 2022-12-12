package com.practice.paging.domain.posting.domain.entity

import com.practice.paging.global.util.UUIDUtil
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class Posting(
    val title: String,
    val content: String,
    val date: LocalDate
){
    @Id
    val id: String = UUIDUtil.generateUUID()
}