package com.debanuj;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Phone", "Mobiles"),
                new Product(105, "Monitor", "Electronics")
        };

        System.out.println("Linear Search");

        Product linearResult = SearchEngine.linearSearch(products, "Phone");

        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Binary Search");

        Product binaryResult = SearchEngine.binarySearch(products, "Phone");

        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Product not found");
    }
}