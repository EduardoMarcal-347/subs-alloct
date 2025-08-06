package com.subs.api.models

import com.subs.api.dto.response.CompanyCardRes
import com.subs.api.enums.PlanType
import jakarta.persistence.*

@Entity
@Table(name = "company_card")
class CompanyCard: BaseModel {
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @get:Enumerated(EnumType.STRING)
    var planType: PlanType? = null

    var price: Int? = null

    @get:ManyToOne()
    @get:JoinColumn(name = "company_id")
    var company: Company? = null

    constructor(id: Int) {
        this.id = id
    }
}

fun CompanyCard.toDto(): CompanyCardRes = CompanyCardRes(
    planType = planType ?: throw RuntimeException("PlanType must not be null"),
    price = price ?: throw RuntimeException("Price must not be null"),
    company = company?.toDto() ?: throw RuntimeException("Company must not be null")
)