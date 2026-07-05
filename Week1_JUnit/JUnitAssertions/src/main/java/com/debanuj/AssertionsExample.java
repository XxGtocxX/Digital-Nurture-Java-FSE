package com.debanuj;

public class AssertionsExample {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getMessage() {
        return "JUnit Assertions";
    }

    public Object getObject() {
        return new Object();
    }

    public Object getNullObject() {
        return null;
    }
}