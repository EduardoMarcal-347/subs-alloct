package com.subs.api.models

import com.subs.api.dto.response.CompanyRes
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "company")
open class Company : BaseModel() {
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    open var name: String? = null

    open var document: String? = null
}

fun Company.toDto(): CompanyRes = CompanyRes(
    name = name ?: throw RuntimeException("Company name cannot be null")
)