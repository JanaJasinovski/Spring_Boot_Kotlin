package be.feanor.arbitr.controller

import be.feanor.arbitr.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import be.feanor.arbitr.model.Type

@RestController
@RequestMapping("/arbitrator")
class ArbitratorController {
//    @Autowired
//    private val productService: ProductService? = null
//    @GetMapping("/productsByType/{type}")
//    fun findAllProductsByType(@PathVariable type: Type): ResponseEntity<*>? {
//        return ResponseEntity.ok(productService?.sendRequestProductByType(type))
//    }
}