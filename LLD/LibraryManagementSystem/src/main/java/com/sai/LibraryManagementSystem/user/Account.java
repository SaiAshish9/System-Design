package com.sai.LibraryManagementSystem.user;

import com.sai.LibraryManagementSystem.enums.AccountStatus;

public abstract class Account {
    private Long id;
    private String password;
    private String person;
    private AccountStatus status;

    Account(Long id, String password, String person){
        this.id = id;
        this.password = password;
        this.person = person;
        this.status = AccountStatus.ACTIVE;
    }

    Account(Long id, String password, String person, AccountStatus status){
        this.id = id;
        this.password = password;
        this.person = person;
        this.status = status;
    }

    void resetPassword(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

}
