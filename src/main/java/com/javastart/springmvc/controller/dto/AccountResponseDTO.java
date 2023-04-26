package com.javastart.springmvc.controller.dto;

import com.javastart.springmvc.entity.Account;

public class AccountResponseDTO {

    private Long accountId;

    private String name;

    private String email;

    public AccountResponseDTO(Long accountId, String name, String email) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
    }

    public AccountResponseDTO(Account account) {
        accountId = account.getAccountId();
        name = account.getName();
        email = account.getEmail();
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
