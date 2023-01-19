package be.feanor.arbitr.repository

import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.Type
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long> {
//    fun findAllProductsByType(type: Type) : List<Product>
    fun findProductByTypeName(name: String) : List<Product>

    fun deleteByTypeName(name: String)
}