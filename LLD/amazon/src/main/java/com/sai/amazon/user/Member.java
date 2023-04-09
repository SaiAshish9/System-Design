package com.sai.amazon.user;

import com.sai.amazon.shopping.Order;

public class Member extends Customer {
    private Account account;

    Member(Account account){
        this.account = account;
    }

    public void place_order(Order order){

    }
}
