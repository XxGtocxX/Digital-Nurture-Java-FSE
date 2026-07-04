package com.debanuj;

import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, int quantity, double price) {

        Product product = products.get(productId);

        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(int productId) {
        products.remove(productId);
    }

    public void displayProducts() {

        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}