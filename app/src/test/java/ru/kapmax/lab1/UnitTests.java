package ru.kapmax.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTests {
    @Test
    public void maxFuncTest() {
        assertEquals(TestsMethods.max(6, 6), 6);
        assertEquals(TestsMethods.max(6, 5), 6);
        assertEquals(TestsMethods.max(5, 6), 6);
        assertEquals(TestsMethods.max(102, 65), 102);
    }

    @Test
    public void minFuncTest() {
        assertEquals(TestsMethods.min(6, 6), 6);
        assertEquals(TestsMethods.min(5, 6), 5);
        assertEquals(TestsMethods.min(6, 5), 5);
        assertEquals(TestsMethods.min(102, 65), 65);
    }

}
