package com.sai.facebook.user;


public class Admin extends Person {
    public Admin(String name, String address, String email, String phone, String account) {
        super(name, address, email, phone, account);
    }

    public void blockUser(Person customer) {
    }

    public void unblockUser(Person customer) {
    }

    public void enablePage(String page) {
    }

    public void disablePage(String page) {
    }

    public void doSomething(String something) {
    }
}