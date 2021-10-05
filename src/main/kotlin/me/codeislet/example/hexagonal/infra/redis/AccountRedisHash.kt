package me.codeislet.example.hexagonal.infra.redis

import me.codeislet.example.hexagonal.domain.Account
import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.0.1
 */
@RedisHash("account")
data class AccountRedisHash(@Id val id: String,
                            val name: String,
                            val phoneNumber: String,
                            val pin: String,
                            val createdAt: LocalDateTime) {

    fun toAccount(): Account {
        return Account(id, name, phoneNumber, pin, createdAt)
    }
}