package be.feanor.arbitr.service.impl

import be.feanor.arbitr.dto.ProductDTO
import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.Type
import be.feanor.arbitr.repository.ProductRepository
import be.feanor.arbitr.repository.TypeRepository
import be.feanor.arbitr.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ProductServiceImpl : ProductService {

    @Autowired
    private val productRepository: ProductRepository? = null

    @Autowired
    private val typeRepository: TypeRepository? = null

//    @Autowired
//    private val userRepository: UserRepository? = null
    override fun findAll(): List<Product?>? {
        return productRepository?.findAll();
    }

    override fun findProductByTypeName(name: String): List<Product>? {
        return productRepository?.findProductByTypeName(typeRepository?.findByName(name)!!.name)
    }

    override fun saveProduct(product: Product): Product {
        return productRepository!!.save(product)
    }

    override fun updateProduct(productDTO: ProductDTO): Product {
        val type = Type(productDTO.typeName)

        val existingProduct: Product = productRepository?.findById(productDTO.id)!!.orElse(null)
        existingProduct.setCreatedTime(LocalDateTime.now())
        existingProduct.setUpdatedTime(LocalDateTime.now())
        existingProduct.setUpdatedTimeByCreatedTimeBy(LocalDateTime.now())
        existingProduct.setPrice(productDTO.price)
        existingProduct.setCount(productDTO.count)
        existingProduct.setType(type)
        existingProduct.setAttachment(productDTO.attachment)

        return productRepository.save(existingProduct);
    }

    override fun deleteProduct(name: String) {
        productRepository?.deleteByTypeName(typeRepository?.findByName(name)!!.name);
    }
//    override fun sendRequestProductByType(type: Type): List<Product>? {
//        return productRepository?.findAllProductsByType(type);
//    }
//
//    override fun createProductByType(type: Type, arbitratorId: Long) {
//        val arbitrator: Optional<User>? = userRepository?.findById(arbitratorId);
//    }

}