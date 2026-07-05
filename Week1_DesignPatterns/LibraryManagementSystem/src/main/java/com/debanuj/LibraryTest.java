package com.debanuj;

public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido van Rossum"),
                new Book(103, "C++", "Bjarne Stroustrup"),
                new Book(104, "Spring", "Rod Johnson")
        };

        System.out.println("Linear Search");

        System.out.println(LibrarySearch.linearSearch(books, "Spring"));

        System.out.println();

        System.out.println("Binary Search");

        System.out.println(LibrarySearch.binarySearch(books, "Spring"));
    }
}