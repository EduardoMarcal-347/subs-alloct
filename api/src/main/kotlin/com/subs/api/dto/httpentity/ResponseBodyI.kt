package com.subs.api.dto.httpentity

import java.time.Instant

abstract class ResponseBodyI {
    val timestamp: Instant = Instant.now()
}