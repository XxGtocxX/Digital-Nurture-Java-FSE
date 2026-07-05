package com.debanuj;

public class SearchingExample {

    public static void main(String[] args) {

        int[] numbers = {12, 25, 7, 40, 18, 33};

        int target = 18;

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Element not found");
        }

    }
}