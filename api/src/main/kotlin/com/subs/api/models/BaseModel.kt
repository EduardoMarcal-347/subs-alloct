package com.subs.api.models

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.Version
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.Instant

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseModel {

    @get:CreatedDate
    open var createdAt: Instant? = null

    @get:LastModifiedDate
    open var lastModifiedAt: Instant? = null

    open var deletedAt: Instant? = null

    @get:Version
    open var version: Int = 0

}
