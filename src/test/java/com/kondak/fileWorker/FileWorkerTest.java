package com.kondak.fileWorker;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileWorkerTest {
    private static FileWorker testInstance;
    private static final String PATH = "src/test/resources/";
    private static final String OUTPUT_PATH = "TEST_RESULT";
    private static final String FILENAME = "test.txt";

    @BeforeAll
    public static void init() {
        testInstance = new FileWorker();
    }

    @Test
    void testReadFile() {
        List<String> expected = new ArrayList<>();
        expected.add("TEST_TSET");

        List<String> actual = testInstance.readFile(PATH, FILENAME);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void TestWriteFile() {
        List<String> expected = new ArrayList<>();
        expected.add("TEST");
        assertTrue(testInstance.writeFile(OUTPUT_PATH + "/", FILENAME, expected));
    }

    @AfterAll
    public static void clean() {
        new File(OUTPUT_PATH + "/" + FILENAME).delete();
        new File(OUTPUT_PATH).delete();
    }
}
