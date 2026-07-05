package com.debanuj;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    private Counter counter;

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        counter = new Counter();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
    }

    @Test
    public void testIncrementOnce() {
        counter.increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    public void testIncrementTwice() {
        counter.increment();
        counter.increment();
        assertEquals(2, counter.getCount());
    }
}