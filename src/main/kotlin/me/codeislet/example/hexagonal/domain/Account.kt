package me.codeislet.example.hexagonal.domain

import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.0.1
 */
data class Account(val id: String,
                   val name: String,
                   val phoneNumber: String,
                   val pin: String,
                   val createdAt: LocalDateTime) {

    fun checkPinMatches(pin: String) {
        if (this.pin != pin) {
            throw AccountPinMissMatchException("account pin miss match.")
        }
    }
}