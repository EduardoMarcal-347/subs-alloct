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
class Company : BaseModel() {
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null

    var name: String? = null

    var document: String? = null
}

fun Company.toDto(): CompanyRes = CompanyRes(
    name = name ?: throw RuntimeException("Company name cannot be null")
)