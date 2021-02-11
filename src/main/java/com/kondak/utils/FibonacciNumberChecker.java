package com.kondak.utils;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public interface FibonacciNumberChecker {
    static boolean isFibonacciNumber(int number) {
        return (sqrt(5 * pow(number, 2) + 4) % 1 == 0) || (sqrt(5 * pow(number, 2) - 4) % 1 == 0);
    }
}
