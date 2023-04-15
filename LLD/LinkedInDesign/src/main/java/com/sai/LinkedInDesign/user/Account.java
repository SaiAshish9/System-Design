package com.sai.LinkedInDesign.user;

import com.sai.LinkedInDesign.enums.AccountStatus;
import lombok.Data;

@Data
public class Account {
    private int id;
    private String password;
    private AccountStatus status;

    public Account(int id, String password, AccountStatus status) {
        this.id = id;
        this.password = password;
        this.status = status;
    }

    public void resetPassword() {
        this.password = null;
    }
}
