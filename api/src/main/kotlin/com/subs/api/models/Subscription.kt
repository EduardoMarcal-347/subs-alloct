package com.subs.api.models

import com.subs.api.dto.response.SubscriptionRes
import com.subs.api.enums.ExpanseType
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "subscription")
class Subscription : BaseModel {
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null

    @get:Enumerated(EnumType.STRING)
    var expanseType: ExpanseType? = null

    @get:ManyToOne
    @get:JoinColumn(name = "company_card_id")
    var companyCard: CompanyCard? = null

    var costumerId: UUID? = null

    constructor( expanseType: ExpanseType, companyCard: CompanyCard, costumerId: UUID ) {
        this.expanseType = expanseType
        this.companyCard = companyCard
        this.costumerId = costumerId
    }
}

fun Subscription.toDto(): SubscriptionRes = SubscriptionRes(
    expanseType = expanseType,
    companyCard = companyCard?.toDto() ?: throw RuntimeException("Company card must not be null")
)