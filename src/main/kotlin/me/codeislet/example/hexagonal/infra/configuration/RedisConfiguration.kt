package me.codeislet.example.hexagonal.infra.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories


/**
 * @author Code Islet
 * @since 0.0.1
 */
@Configuration
@EnableRedisRepositories
class RedisConfiguration {

    @Bean
    fun redisConnectionFactory(): RedisConnectionFactory {
        val configuration = RedisStandaloneConfiguration()
        configuration.hostName = "localhost"
        configuration.port = 6379
        configuration.database = 0
        return LettuceConnectionFactory(configuration, LettuceClientConfiguration.defaultConfiguration())
    }
}