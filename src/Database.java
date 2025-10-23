package com.example.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Product> products;

    public Database() {
        products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1200.00));
        products.add(new Product(2, "Phone", 80.00));
        products.add(new Product(3, "Headphones", 150.00));
        products.add(new Product(4, "Keyboard", 10.00));
        products.add(new Product(5, "Mouse", 5.00));
        products.add(new Product(6, "Shoes", 120.00));
        products.add(new Product(7, "Smartwatch", 100.00));
        products.add(new Product(8, "Trouser", 10.00));
        products.add(new Product(9, "Jacket", 50.00));
        products.add(new Product(10, "Charger", 10.00));
    }

    public List<Product> getProducts() {
        return products;
    }
}
