package me.codeislet.example.hexagonal.application.response

import me.codeislet.example.hexagonal.domain.Account


/**
 * @author Code Islet
 * @since 0.0.1
 */
data class AccountSimpleResponse(val id: String, val name: String, val phoneNumber: String) {

    companion object {
        fun of(account: Account?): AccountSimpleResponse? {
            if (account == null) {
                return null
            }
            return AccountSimpleResponse(account.id, account.name, account.phoneNumber)
        }
    }
}