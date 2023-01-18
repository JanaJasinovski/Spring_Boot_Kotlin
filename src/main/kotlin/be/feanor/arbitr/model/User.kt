package be.feanor.arbitr.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "user")
class User (
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(name = "username", unique = true, nullable = false, length = 100)
        val username : String,

        @ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        @JoinTable(name = "user_role",
                joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
                inverseJoinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")]
        )
        val role : Set<Role>,
        createdTime: LocalDateTime, updatedTime: LocalDateTime, updatedTimeByCreatedTime: LocalDateTime,

) : BaseEntity(createdTime, updatedTime, updatedTimeByCreatedTime) {
}