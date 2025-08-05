package com.subs.api.dto.response

import com.subs.api.enums.PlanType

data class CompanyCardRes(
    val planType: PlanType,
    val price: Int,
    val company: CompanyRes
)

