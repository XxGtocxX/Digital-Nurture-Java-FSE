package com.debanuj;

public class SortingTest {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Alice", 4500),
                new Order(102, "Bob", 2200),
                new Order(103, "Charlie", 6700),
                new Order(104, "David", 1800)
        };

        System.out.println("Bubble Sort");

        BubbleSort.sort(orders);

        for (Order order : orders)
            System.out.println(order);

        orders = new Order[]{
                new Order(101, "Alice", 4500),
                new Order(102, "Bob", 2200),
                new Order(103, "Charlie", 6700),
                new Order(104, "David", 1800)
        };

        System.out.println("\nQuick Sort");

        QuickSort.sort(orders, 0, orders.length - 1);

        for (Order order : orders)
            System.out.println(order);
    }
}