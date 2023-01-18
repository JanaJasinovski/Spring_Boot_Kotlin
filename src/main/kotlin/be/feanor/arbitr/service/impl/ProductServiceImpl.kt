package be.feanor.arbitr.service.impl

import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.Type
import be.feanor.arbitr.model.User
import be.feanor.arbitr.repository.ProductRepository
import be.feanor.arbitr.repository.UserRepository
import be.feanor.arbitr.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl : ProductService{
    private val productRepository: ProductRepository? = null
    private val userRepository: UserRepository? = null
    override fun sendRequestProductByType(type: Type): List<Product>? {
        return productRepository?.findAllProductsByType(type);
    }

    override fun createProductByType(type: Type, arbitratorId: Long) {
        val arbitrator: Optional<User>? = userRepository?.findById(arbitratorId);
    }

}