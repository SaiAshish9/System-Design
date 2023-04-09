package com.sai.amazon.shopping;

import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    ShoppingCart(List<Item> items){
        this.items = items;
    }

    public List<Item> get_items(){
        return items;
    }

    void add_item(Item item){}

    void remove_item(Item item){}

    void update_item_quantity(Item item, Long quantity){}

    void checkout(){}

}
