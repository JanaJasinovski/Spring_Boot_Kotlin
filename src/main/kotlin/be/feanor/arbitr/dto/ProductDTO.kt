package be.feanor.arbitr.dto

import java.time.LocalDateTime

data class ProductDTO(
    val id: Long,
    var createdTime: LocalDateTime,
    var updatedTime: LocalDateTime,
    var updatedTimeByCreatedTimeBy: LocalDateTime,
    var price: Double,
    var count: Int,
    var typeName: String,
    var attachment: String,
) {
}