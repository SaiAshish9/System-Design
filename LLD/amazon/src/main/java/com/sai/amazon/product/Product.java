package com.sai.amazon.product;

import com.sai.amazon.user.Account;

public class Product {
    private String product_id;
    private String name;
    private String description;
    private float price;
    private String category;
    private Long available_item_count;
    private Account seller;

    public Product(String id, String name, String description, float price, String category, Long available_item_count, Account seller_account){
        product_id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.available_item_count = 0L;
        this.seller = seller_account;
    }

    public Long get_available_count(){
        return available_item_count;
    }

    public void update_price(float price){
        this.price = price;
    }
}
