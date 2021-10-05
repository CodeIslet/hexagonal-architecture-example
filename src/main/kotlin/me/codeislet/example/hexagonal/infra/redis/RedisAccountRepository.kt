package me.codeislet.example.hexagonal.infra.redis

import me.codeislet.example.hexagonal.domain.Account
import me.codeislet.example.hexagonal.domain.repository.AccountRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.0.1
 */
@Repository
class RedisAccountRepository(val accountRedisHashRepository: AccountRedisHashRepository): AccountRepository {

    override suspend fun save(account: Account): Account {
        return accountRedisHashRepository.save(
            AccountRedisHash(account.id, account.name, account.phoneNumber, account.pin, LocalDateTime.now())
        ).toAccount()
    }

    override suspend fun findById(id: String): Account? {
        return accountRedisHashRepository.findTopById(id)?.toAccount()
    }
}