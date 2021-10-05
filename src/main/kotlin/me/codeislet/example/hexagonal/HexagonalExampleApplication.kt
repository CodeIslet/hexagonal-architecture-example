package me.codeislet.example.hexagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux


/**
 * @author Code Islet
 * @since 0.0.1
 */
@EnableWebFlux
@SpringBootApplication
class HexagonalExampleApplication

fun main(args: Array<String>) {
    runApplication<HexagonalExampleApplication>(*args)
}
