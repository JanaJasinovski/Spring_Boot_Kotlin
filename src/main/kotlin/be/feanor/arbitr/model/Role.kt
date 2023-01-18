package be.feanor.arbitr.model

import java.time.LocalDateTime
import javax.persistence.*

@Table(name = "role")
@Entity
class Role (
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(name = "admin", nullable = false)
        val admin : String,

        @Column(name = "arbitrator", nullable = false)
        val arbitrator : String,

        @Column(name = "supplier", nullable = false)
        val supplier : String,

        createdTime: LocalDateTime, updatedTime: LocalDateTime, updatedTimeByCreatedTime: LocalDateTime

) : BaseEntity(createdTime, updatedTime, updatedTimeByCreatedTime) {
}