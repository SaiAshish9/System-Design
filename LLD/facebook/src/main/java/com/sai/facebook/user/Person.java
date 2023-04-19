package com.sai.facebook.user;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Person {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String account;

    public Person(String name, String address, String email, String phone, String account) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.account = account;
    }
}