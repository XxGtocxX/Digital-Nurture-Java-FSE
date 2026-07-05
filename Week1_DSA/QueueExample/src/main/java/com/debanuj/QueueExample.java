package com.debanuj;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Initial Queue:");
        System.out.println(queue);

        System.out.println("\nFront Element:");
        System.out.println(queue.peek());

        System.out.println("\nRemoving Front Element:");
        System.out.println(queue.poll());

        System.out.println("\nQueue after Poll:");
        System.out.println(queue);

        System.out.println("\nIs Queue Empty?");
        System.out.println(queue.isEmpty());

        System.out.println("\nTraversing Queue:");

        for (String student : queue) {
            System.out.println(student);
        }
    }
}