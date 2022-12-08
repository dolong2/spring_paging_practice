package com.practice.paging.domain.posting.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate
import java.util.UUID

@Entity
class Posting(
    val title: String,
    val content: String,
    val date: LocalDate
){
    @Id
    val id: String = UUID.randomUUID().toString()
}