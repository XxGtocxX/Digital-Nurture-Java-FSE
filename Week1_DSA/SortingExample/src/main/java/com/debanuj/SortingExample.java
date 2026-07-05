package com.debanuj;

import java.util.Arrays;

public class SortingExample {

    public static void main(String[] args) {

        int[] numbers = {45, 12, 89, 23, 7, 56};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(numbers));
    }
}