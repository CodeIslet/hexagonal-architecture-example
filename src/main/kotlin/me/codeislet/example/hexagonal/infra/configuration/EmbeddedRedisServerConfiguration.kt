package me.codeislet.example.hexagonal.infra.configuration

import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Configuration
import redis.embedded.RedisServer
import java.util.*


/**
 * @author Code Islet
 * @since 0.0.1
 */
@Configuration
class EmbeddedRedisServerConfiguration: InitializingBean, DisposableBean {

    lateinit var redisServer: RedisServer

    override fun afterPropertiesSet() {
        redisServer = RedisServer(6379)
        redisServer.start()
    }

    override fun destroy() {
        Optional.ofNullable(redisServer).ifPresent(RedisServer::stop)
    }
}