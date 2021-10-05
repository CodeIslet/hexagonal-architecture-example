package me.codeislet.example.hexagonal.infra.h2

import org.springframework.data.r2dbc.repository.R2dbcRepository


/**
 * @author Code Islet
 * @since 0.0.1
 */
interface AccountR2dbcRepository: R2dbcRepository<AccountEntity, String> {

    suspend fun findTopById(id: String): AccountEntity?
}