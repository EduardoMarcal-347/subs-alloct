package com.subs.api.dto.httpentity

class ResponseDTO<out ResponseBodyI>(
    val statusCode: Int,
    val body: ResponseBodyI
)