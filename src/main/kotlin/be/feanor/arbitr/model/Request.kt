package be.feanor.arbitr.model

import be.feanor.arbitr.enum.RoleName
import javax.persistence.*

@Entity
@Table(name = "request")
class Request(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val userOwner : User,
        val userAssigner : User

) : BaseEntity()

