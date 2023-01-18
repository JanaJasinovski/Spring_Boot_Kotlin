package be.feanor.arbitr.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "users")
class User (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id : Long,

        @Column(name = "sex", nullable = false)
        val sex: String,

        @Column(name = "name", nullable = false)
        val name : String,

        @Column(name = "surname", nullable = false)
        val surname: String,

        @Column(name = "age", nullable = false)
        val age: Int,

        @Column(name = "password", nullable = false)
        val password: String,

        @Column(name = "create_time", nullable = false)
        val createTime: LocalDateTime,

        @Enumerated(EnumType.STRING)
        @Column(name = "role", nullable = false)
        val role : Role,

        @Column(name = "product", nullable = false)
        val product: Product
) {
}