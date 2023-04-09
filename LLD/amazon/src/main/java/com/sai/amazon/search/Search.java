package com.sai.amazon.search;

import com.sai.amazon.product.Product;

import java.util.List;

public interface Search {

    List<Product> search_products_by_name(String name);
    List<Product> search_products_by_category(String category);

}
