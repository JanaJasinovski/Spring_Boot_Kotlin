package be.feanor.arbitr.repository

import be.feanor.arbitr.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
//    fun findById(id: Long?): User?
}