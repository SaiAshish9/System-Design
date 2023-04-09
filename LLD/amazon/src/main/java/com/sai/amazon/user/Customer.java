package com.sai.amazon.user;

import com.sai.amazon.shopping.Item;
import com.sai.amazon.shopping.Order;
import com.sai.amazon.shopping.ShoppingCart;

public abstract class Customer {
    private ShoppingCart cart;
    private Order order;

    public ShoppingCart get_shopping_cart(){
        return cart;
    }

    public void add_item_to_cart(Item item){

    }

    public void remove_item_from_cart(Item item){

    }

}
