package com.sai.facebook.user;

import com.sai.facebook.enums.AccountStatus;

import java.math.BigInteger;

public class Account {
    private BigInteger id;
    private String password;
    private AccountStatus status;

    public Account(BigInteger id, String password, AccountStatus status) {
        this.id = id;
        this.password = password;
        this.status = status;
    }

    public void resetPassword() {
    }
}