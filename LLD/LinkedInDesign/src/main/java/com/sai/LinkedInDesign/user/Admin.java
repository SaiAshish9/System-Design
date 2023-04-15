package com.sai.LinkedInDesign.user;

public class Admin extends Person {

    public Admin(String name, String address, String email, String phone, String account) {
        super(name, address, email, phone, account);
    }

    public void blockUser(Account customer) {
    }

    public void unblockUser(Account customer) {
    }
}
