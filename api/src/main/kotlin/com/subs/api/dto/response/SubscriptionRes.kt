package com.subs.api.dto.response

import com.subs.api.enums.ExpanseType

data class SubscriptionRes(
    val expanseType: ExpanseType?,
    val companyCard: CompanyCardRes,
)