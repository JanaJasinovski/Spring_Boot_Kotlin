package be.feanor.arbitr.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity {
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    @Column(name = "created_time", nullable = false, updatable = true)
    var createdTime: LocalDateTime? = null

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    @Column(name = "updated_time", nullable = false, updatable = true)
    var updatedTime: LocalDateTime? = null

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    @Column(name = "updated_time_by_created_time_by", nullable = false, updatable = true)
    var updatedTimeByCreatedTimeBy: LocalDateTime? = null

    fun setCreatedTime(value: LocalDateTime) {
        createdTime = value
    }

    fun setUpdatedTime(value: LocalDateTime) {
        updatedTime = value
    }

    fun setUpdatedTimeByCreatedTimeBy(value: LocalDateTime) {
        updatedTimeByCreatedTimeBy = value
    }
}