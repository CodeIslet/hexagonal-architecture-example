package me.codeislet.example.hexagonal.domain.service

import me.codeislet.example.hexagonal.domain.Account
import me.codeislet.example.hexagonal.domain.repository.AccountRepository
import org.springframework.stereotype.Service


/**
 * @author Code Islet
 * @since 0.0.1
 */
@Service
class AccountServiceImpl(val accountRepository: AccountRepository): AccountService {

    override suspend fun createAccount(account: Account): Account {
        return accountRepository.save(account)
    }

    override suspend fun getAccount(id: String): Account? {
        return accountRepository.findById(id)
    }
}