package be.feanor.arbitr.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "product")
class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id : Long,

        @Column(name = "name", nullable = false)
        val name: String,

        @Column(name = "price", nullable = false)
        val price: Double,

        @Column(name = "count", nullable = false)
        val count: Int,

        @Column(name = "create_time", nullable = false)
        val createTime: LocalDateTime,
) {
}