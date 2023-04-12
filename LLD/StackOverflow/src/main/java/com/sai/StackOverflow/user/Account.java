package com.sai.StackOverflow.user;

import com.sai.StackOverflow.enums.AccountStatus;
import lombok.Data;

@Data
public class Account {
    private int id;
    private String password;
    private String name;
    private String address;
    private String email;
    private String phone;
    private AccountStatus status;
    private int reputation;

    public Account(int id, String password, String name, String address, String email, String phone,
                   AccountStatus status) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.reputation = 0;
    }

    public void resetPassword() {
    }

}


