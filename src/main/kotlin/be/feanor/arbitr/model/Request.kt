package be.feanor.arbitr.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "request")
class Request(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @ManyToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "user_id", nullable = false)
        val user: User,

        @ManyToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "product_id", nullable = false)
        val product: Product,

        createdTime: LocalDateTime, updatedTime: LocalDateTime, updatedTimeByCreatedTime: LocalDateTime

) : BaseEntity(createdTime, updatedTime, updatedTimeByCreatedTime) {
}