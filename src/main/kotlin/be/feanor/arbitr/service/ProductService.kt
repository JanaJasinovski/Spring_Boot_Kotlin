package be.feanor.arbitr.service

import be.feanor.arbitr.model.Product
import be.feanor.arbitr.model.Type

interface ProductService {

    fun sendRequestProductByType(type: Type) : List<Product>?
}