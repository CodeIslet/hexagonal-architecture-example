package me.codeislet.example.hexagonal.infra.h2

import me.codeislet.example.hexagonal.domain.Account
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.0.1
 */
@Table("account")
data class AccountEntity(@Id val id: String,
                         val name: String,
                         val phoneNumber: String,
                         val pin: String,
                         val createdAt: LocalDateTime) {

    fun toAccount(): Account {
        return Account(id, name, phoneNumber, pin, createdAt)
    }
}