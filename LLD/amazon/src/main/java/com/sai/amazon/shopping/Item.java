package com.sai.amazon.shopping;

public class Item {
    private String product_id;
    private Long quantity;
    private float price;

    Item(String id, Long quantity, float price){
        this.product_id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public void update_quantity(Long quantity){

    }

}
