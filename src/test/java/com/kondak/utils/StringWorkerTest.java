package com.kondak.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringWorkerTest {

    @Test
    void reversString() {
        String word = "TEST";
        String expected = "TSET";

        StringWorker stringWorker = new StringWorker(word);
        String actual = stringWorker.reversString();
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }
}