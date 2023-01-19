package be.feanor.arbitr.service

import be.feanor.arbitr.dto.ProductDTO
import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.Type


interface ProductService {

//    fun sendRequestProductByType(type: Type) : List<Product>?
//
//    fun createProductByType(type: Type, arbitratorId: Long)

    fun findAll(): List<Product?>?

    fun findProductByTypeName(name: String): List<Product>?

    fun saveProduct(product: Product): Product

    fun  updateProduct(product: ProductDTO) : Product

    fun deleteProduct(name: String)
}