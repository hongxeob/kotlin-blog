package org.example.kotlinblog.util

data class CmResDto<T>(
    val resultCode: T, val message: String, val data: T
) {}
