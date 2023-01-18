package be.feanor.arbitr.model

import javax.persistence.*

@Entity
@Table(name = "request")
class Request(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @ManyToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "user_owner_id", nullable = false)
        val owner : User,

        @ManyToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "user_assignee_id", nullable = false)
        val assignee : User? = null

) : BaseEntity()

