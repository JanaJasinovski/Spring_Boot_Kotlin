package be.feanor.arbitr.controller

import be.feanor.arbitr.dto.ProductDTO
import be.feanor.arbitr.model.Product
import be.feanor.arbitr.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/product")
class ProductController {

    @Autowired
    private val service: ProductService? = null

    @PostMapping("/addProduct")
    fun addProduct(@RequestBody product: Product): Product {
        return service!!.saveProduct(product)
    }

    @GetMapping("/products")
    fun findAllProducts(): List<Product?>? {
        return service?.findAll()
    }

    @GetMapping("/productByTypeName/{name}")
    fun findProductById(@PathVariable name: String): List<Product>? {
        return service?.findProductByTypeName(name)
    }

    @PutMapping("/update")
    fun updateProduct(@RequestBody productDTO: ProductDTO): Product? {
        return service!!.updateProduct(productDTO)
    }

    @DeleteMapping("/delete/{name}")
    fun deleteProduct(@PathVariable name: String) {
        return service!!.deleteProduct(name)
    }

}