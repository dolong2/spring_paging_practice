package com.practice.paging.global.util

import java.util.*

object UUIDUtil {
    fun generateUUID(): String =
        UUID.randomUUID().toString().split("-")[0]+"-"+UUID.randomUUID().toString().split("-")[1]
}