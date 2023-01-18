package be.feanor.arbitr.service.impl

import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.User
import be.feanor.arbitr.repository.UserRepository
import be.feanor.arbitr.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    private val userRepository: UserRepository? = null
    override fun findAllProductsByUserArbitratorId(): List<Product?>? {
        return null
    }

    override fun findAllUsers(): List<User?>? {
        return userRepository!!.findAll()
    }
}