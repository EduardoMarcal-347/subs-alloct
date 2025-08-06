package com.subs.api.controllers

import com.subs.api.dto.request.SubscriptionReq
import com.subs.api.dto.httpentity.ResponseDTO
import com.subs.api.dto.response.SubscriptionRes
import com.subs.api.service.SubscriptionService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/manager/subscription/")
class SubscriptionController(
    val service: SubscriptionService
) {

    @PostMapping()
    fun <T> create(@RequestBody @Validated req: SubscriptionReq): ResponseEntity<ResponseDTO<SubscriptionRes>> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(service.createSubscription())
    }

}