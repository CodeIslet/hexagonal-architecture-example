package me.codeislet.example.hexagonal.infra.h2

import kotlinx.coroutines.reactor.awaitSingle
import me.codeislet.example.hexagonal.domain.Account
import me.codeislet.example.hexagonal.domain.repository.AccountRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.0.1
 */
@Primary
@Repository
class H2AccountRepository(val accountR2dbcRepository: AccountR2dbcRepository): AccountRepository {

    override suspend fun save(account: Account): Account {
        return accountR2dbcRepository.save(
            AccountEntity(account.id, account.name, account.phoneNumber, account.pin, LocalDateTime.now())
        ).awaitSingle().toAccount()
    }

    override suspend fun findById(id: String): Account? {
        return accountR2dbcRepository.findTopById(id)?.toAccount()
    }
}