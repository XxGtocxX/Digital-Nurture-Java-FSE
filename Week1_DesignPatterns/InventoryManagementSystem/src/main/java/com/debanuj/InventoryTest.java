package com.debanuj;

public class InventoryTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 65000));
        inventory.addProduct(new Product(102, "Keyboard", 25, 1200));
        inventory.addProduct(new Product(103, "Mouse", 30, 700));

        System.out.println("Initial Inventory");

        inventory.displayProducts();

        inventory.updateProduct(102, 40, 1100);

        System.out.println("\nAfter Update");

        inventory.displayProducts();

        inventory.deleteProduct(103);

        System.out.println("\nAfter Delete");

        inventory.displayProducts();
    }
}