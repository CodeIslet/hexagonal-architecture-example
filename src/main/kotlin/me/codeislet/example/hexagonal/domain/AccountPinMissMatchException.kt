package me.codeislet.example.hexagonal.domain


/**
 * @author Code Islet
 * @since 0.0.1
 */
class AccountPinMissMatchException(override var message: String): RuntimeException()