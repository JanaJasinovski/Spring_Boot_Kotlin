package be.feanor.arbitr.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "product")
class Product(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(name = "price", nullable = false)
        val price: Double,

        @Column(name = "count", nullable = false)
        val count: Int,

        @Column(name = "create_time", nullable = false)
        val createTime: LocalDateTime,

        @ManyToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "type_id", nullable = false)
        val type: Type,

        createdTime: LocalDateTime, updatedTime: LocalDateTime, updatedTimeByCreatedTime: LocalDateTime,

) : BaseEntity(createdTime, updatedTime, updatedTimeByCreatedTime) {
}