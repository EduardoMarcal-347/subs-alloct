package com.subs.api.models

import com.subs.api.enums.ExpanseType
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "subscription")
open class Subscription : BaseModel() {
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @get:Enumerated(EnumType.STRING)
    open var expanseType: ExpanseType? = null

    @get:ManyToOne
    @get:JoinColumn(name = "company_card_id")
    open var companyCard: CompanyCard? = null

    open var costumerId: UUID? = null
}