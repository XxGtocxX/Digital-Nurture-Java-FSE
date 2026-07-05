package com.debanuj;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Printing Array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }

        System.out.println();

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum = " + max);

        int min = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Minimum = " + min);
    }
}