package com.debanuj;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsExampleTest {

    AssertionsExample example = new AssertionsExample();

    @Test
    public void testAssertEquals() {
        assertEquals(10, example.add(4, 6));
    }

    @Test
    public void testAssertTrue() {
        assertTrue(example.isEven(8));
    }

    @Test
    public void testAssertFalse() {
        assertFalse(example.isEven(5));
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(example.getObject());
    }

    @Test
    public void testAssertNull() {
        assertNull(example.getNullObject());
    }

    @Test
    public void testAssertSame() {
        String str = "JUnit";
        assertSame(str, str);
    }

    @Test
    public void testAssertNotSame() {
        String str1 = new String("Java");
        String str2 = new String("Java");
        assertNotSame(str1, str2);
    }

    @Test
    public void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAssertMessage() {
        assertEquals("JUnit Assertions", example.getMessage());
    }
}