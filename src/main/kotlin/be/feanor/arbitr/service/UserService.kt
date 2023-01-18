package be.feanor.arbitr.service

import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.User

interface UserService {

    fun findAllProductsByUserArbitratorId(): List<Product?>?

    fun findAllUsers(): List<User?>?
}