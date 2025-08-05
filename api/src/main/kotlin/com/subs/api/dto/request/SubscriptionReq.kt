package com.subs.api.dto.request

import com.subs.api.enums.ExpanseType
import com.subs.api.models.Subscription
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.util.*

data class SubscriptionReq(
    @field:NotBlank
     val expanseType: ExpanseType,
    @field:NotNull
     val companyCard: CompanyCardReq,
    @field:NotNull
     val costumerId: UUID
)

fun SubscriptionReq.toEntity(): Subscription = Subscription(
    expanseType = expanseType,
    companyCard = companyCard.toEntity(),
    costumerId = costumerId
)
