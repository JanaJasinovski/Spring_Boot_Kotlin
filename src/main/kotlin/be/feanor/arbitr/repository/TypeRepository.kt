package be.feanor.arbitr.repository

import be.feanor.arbitr.model.Type
import org.springframework.data.jpa.repository.JpaRepository

interface TypeRepository: JpaRepository<Type, Long> {
    fun findByName(name: String) : Type
}