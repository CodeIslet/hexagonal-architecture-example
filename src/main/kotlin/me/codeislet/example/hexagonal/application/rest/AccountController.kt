package me.codeislet.example.hexagonal.application.rest

import me.codeislet.example.hexagonal.application.response.AccountSimpleResponse
import me.codeislet.example.hexagonal.domain.service.AccountService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 * @author Code Islet
 * @since 0.0.1
 */
@RestController
@RequestMapping("/accounts")
class AccountController(val accountService: AccountService) {

    @GetMapping("/{id}")
    suspend fun getAccount(@PathVariable("id") id: String): ResponseEntity<AccountSimpleResponse> {
        return ResponseEntity(AccountSimpleResponse.of(accountService.getAccount(id)), HttpStatus.OK)
    }
}