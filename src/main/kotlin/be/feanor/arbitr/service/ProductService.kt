package be.feanor.arbitr.service

import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.Type
import be.feanor.arbitr.model.User

interface ProductService {

    fun sendRequestProductByType(type: Type) : List<Product>?

    fun createProductByType(type: Type, arbitratorId: Long)
}