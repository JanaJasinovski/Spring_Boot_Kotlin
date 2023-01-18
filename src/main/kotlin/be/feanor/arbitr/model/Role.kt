package be.feanor.arbitr.model

import be.feanor.arbitr.enum.RoleName
import javax.persistence.*

@Table(name = "role")
@Entity
class Role (
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(name = "name")
        @Enumerated(EnumType.STRING)
        val name : RoleName,

) : BaseEntity()