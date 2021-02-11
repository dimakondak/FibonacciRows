package com.kondak.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FibonacciNumberCheckerTest {

    @Test
    void isFibonacciNumberTrue() {
        int numberFromFibonacciRow = 1;
        assertTrue(FibonacciNumberChecker.isFibonacciNumber(numberFromFibonacciRow));
    }

    @Test
    void isFibonacciNumberFalse() {
        int numberNotFromFibonacciRow = 4;
        assertFalse(FibonacciNumberChecker.isFibonacciNumber(numberNotFromFibonacciRow));
    }
}