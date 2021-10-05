package me.codeislet.example.hexagonal.domain.service

import me.codeislet.example.hexagonal.domain.Account


/**
 * @author Code Islet
 * @since 0.0.1
 */
interface AccountService {

    suspend fun createAccount(account: Account): Account

    suspend fun getAccount(id: String): Account?
}