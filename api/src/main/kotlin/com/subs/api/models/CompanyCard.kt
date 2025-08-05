package com.subs.api.models

import com.subs.api.dto.response.CompanyCardRes
import com.subs.api.enums.PlanType
import jakarta.persistence.*

@Entity
@Table(name = "company_card")
open class CompanyCard: BaseModel {
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Int? = null

    @get:Enumerated(EnumType.STRING)
    open var planType: PlanType? = null

    open var price: Int? = null

    @get:ManyToOne()
    @get:JoinColumn(name = "company_id")
    open var company: Company? = null

    constructor(id: Int) {
        this.id = id
    }
}

fun CompanyCard.toDto(): CompanyCardRes = CompanyCardRes(
    planType = planType ?: throw RuntimeException("PlanType must not be null"),
    price = price ?: throw RuntimeException("Price must not be null"),
    company = company?.toDto() ?: throw RuntimeException("Company must not be null")
)