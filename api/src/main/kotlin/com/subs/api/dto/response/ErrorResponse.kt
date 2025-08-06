package com.subs.api.dto.response

import com.subs.api.dto.httpentity.ResponseBodyI

data class ErrorResponse(
    val cause: String
): ResponseBodyI()
