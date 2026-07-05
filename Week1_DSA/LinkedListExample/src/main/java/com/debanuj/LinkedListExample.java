package com.debanuj;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        System.out.println("Initial List:");
        System.out.println(students);

        students.addFirst("John");
        students.addLast("David");

        System.out.println("\nAfter adding elements:");
        System.out.println(students);

        students.remove("Bob");

        System.out.println("\nAfter removing Bob:");
        System.out.println(students);

        System.out.println("\nFirst Student: " + students.getFirst());
        System.out.println("Last Student: " + students.getLast());

        System.out.println("\nTraversing LinkedList:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}