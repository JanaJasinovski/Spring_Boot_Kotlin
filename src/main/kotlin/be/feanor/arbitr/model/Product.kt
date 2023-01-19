package be.feanor.arbitr.model

import javax.persistence.*

@Entity
@Table(name = "product")
class Product(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(name = "price", nullable = false)
    var price: Double,

    @Column(name = "count", nullable = false)
    var count: Int,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "type_id", nullable = false)
    var type: Type,

    @Column(name = "attachment", nullable = true)
    var attachment: String,

    ) : BaseEntity() {

    fun setPrice(value: Double) {
        price = value
    }
    fun setCount(value: Int) {
        count = value
    }

    fun setType(value: Type) {
        type = value
    }

    fun setAttachment(value: String) {
        attachment = value
    }
}

