package com.subs.api.repository

import com.subs.api.models.Subscription
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface SubscriptionRepository: JpaRepository<Subscription, UUID> {

    fun existsByCustomerIdAndCompanyCardId(customerId: UUID, companyCardId: Int): Boolean

}