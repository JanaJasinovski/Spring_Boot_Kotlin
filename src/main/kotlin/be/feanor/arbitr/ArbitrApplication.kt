package be.feanor.arbitr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ArbitrApplication

fun main(args: Array<String>) {
	runApplication<ArbitrApplication>(*args)
}
