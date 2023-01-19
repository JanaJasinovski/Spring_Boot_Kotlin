package be.feanor.arbitr.model

import javax.persistence.*

@Entity
@Table(name = "type")
open class Type(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        open val id: Long,

        @Column(name = "name")
        open val name: String
) {
        constructor(name: String) : this(0,name) {
        }
}

