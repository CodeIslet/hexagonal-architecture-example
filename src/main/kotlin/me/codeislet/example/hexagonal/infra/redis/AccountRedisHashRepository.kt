package me.codeislet.example.hexagonal.infra.redis

import org.springframework.data.repository.CrudRepository


/**
 * @author Code Islet
 * @since 0.0.1
 */
interface AccountRedisHashRepository: CrudRepository<AccountRedisHash, String> {

    fun findTopById(id: String): AccountRedisHash?
}