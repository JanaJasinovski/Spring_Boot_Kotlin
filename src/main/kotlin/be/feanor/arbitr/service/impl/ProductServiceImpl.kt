package be.feanor.arbitr.service.impl

import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.Type
import be.feanor.arbitr.repository.ProductRepository
import be.feanor.arbitr.service.ProductService
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl : ProductService{
    private val productRepository: ProductRepository? = null
    override fun sendRequestProductByType(type: Type): List<Product>? {
        return productRepository?.findAllProductsByType(type);
    }

}