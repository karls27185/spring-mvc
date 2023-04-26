package com.javastart.springmvc.controller;

import com.javastart.springmvc.controller.dto.AccountRequestDTO;
import com.javastart.springmvc.controller.dto.AccountResponseDTO;
import com.javastart.springmvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello";
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
    public Long createAccount(@RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.saveAccount(accountRequestDTO.getName(), accountRequestDTO.getEmail());
    }

    @RequestMapping(value = "/accounts/{accountId}", method = RequestMethod.GET)
    public AccountResponseDTO getAccount(@PathVariable Long accountId) {
        return new AccountResponseDTO(accountService.findAccountById(accountId));
    }
}
