package me.codeislet.example.hexagonal.domain.repository

import me.codeislet.example.hexagonal.domain.Account


/**
 * @author Code Islet
 * @since 0.0.1
 */
interface AccountRepository {

    suspend fun save(account: Account): Account

    suspend fun findById(id: String): Account?
}