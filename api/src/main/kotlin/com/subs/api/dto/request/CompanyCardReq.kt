package com.subs.api.dto.request

import com.subs.api.models.CompanyCard
import jakarta.validation.constraints.NotNull

data class CompanyCardReq (
    @field:NotNull
    val id: Int
)

fun CompanyCardReq.toEntity(): CompanyCard = CompanyCard(
    id = id
)
