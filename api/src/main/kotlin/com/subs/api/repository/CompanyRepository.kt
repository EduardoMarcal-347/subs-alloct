package com.subs.api.repository

import com.subs.api.models.Company
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CompanyRepository: JpaRepository<Company, UUID> {
}