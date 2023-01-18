package be.feanor.arbitr.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity(
        @Column(name = "created_time", nullable = false)
        open val createdTime: LocalDateTime,

        @Column(name = "updated_time", nullable = false)
        open val updatedTime: LocalDateTime,

        @Column(name = "updated_time_by_created_time_by", nullable = false)
        open val updatedTimeByCreatedTimeBy: LocalDateTime
) {
}