package com.debanuj;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Initial Stack:");
        System.out.println(stack);

        System.out.println("\nTop Element:");
        System.out.println(stack.peek());

        System.out.println("\nRemoving Top Element:");
        System.out.println(stack.pop());

        System.out.println("\nStack after Pop:");
        System.out.println(stack);

        System.out.println("\nIs Stack Empty?");
        System.out.println(stack.isEmpty());

        System.out.println("\nTraversing Stack:");

        for (Integer num : stack) {
            System.out.println(num);
        }
    }
}