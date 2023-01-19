package be.feanor.arbitr.controller

import be.feanor.arbitr.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/admin")
class AdminController {
//    @Autowired
//    private val userService: UserService? = null
//    @GetMapping("allProductsByArbitrator")
//    fun findAllProductsByArbitrator(): ResponseEntity<*>? {
//        return ResponseEntity.ok(userService?.findAllProductsByUserArbitratorId())
//    }
}