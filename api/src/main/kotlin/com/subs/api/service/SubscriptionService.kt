package com.subs.api.service

import com.subs.api.dto.httpentity.ResponseDTO
import com.subs.api.dto.request.SubscriptionReq
import com.subs.api.dto.request.toEntity
import com.subs.api.dto.response.SubscriptionRes
import com.subs.api.models.toDto
import com.subs.api.repository.SubscriptionRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class SubscriptionService(
    val repository: SubscriptionRepository
) {

    fun createSubscription(req: SubscriptionReq) : ResponseDTO<SubscriptionRes>{
        if (subscriptionAlreadyExists(req)) {
            throw RuntimeException("This subscription Already Exists") //TODO: criar custom exception e controller advice
        }

        val entity = repository.save(req.toEntity())
        return ResponseDTO(
            HttpStatus.CREATED.value(),
            entity.toDto()
        )
    }

    fun subscriptionAlreadyExists(subscription: SubscriptionReq): Boolean {
        return repository.existsByCustomerIdAndCompanyCardId(
            subscription.costumerId,
            subscription.companyCard.id
        )
    }

}