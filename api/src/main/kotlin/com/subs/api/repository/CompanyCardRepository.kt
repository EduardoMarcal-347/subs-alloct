package com.subs.api.repository

import com.subs.api.models.CompanyCard
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CompanyCardRepository: JpaRepository<CompanyCard, UUID> {
}