package be.feanor.arbitr.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity {
    @Column(name = "created_time", nullable = false, updatable = true)
    var createdTime: LocalDateTime? = null

    @Column(name = "updated_time", nullable = false, updatable = true)
    var updatedTime: LocalDateTime? = null

    @Column(name = "updated_time_by_created_time_by", nullable = false, updatable = true)
    var updatedTimeByCreatedTimeBy: LocalDateTime? = null
}