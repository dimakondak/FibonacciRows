package com.kondak;

import com.kondak.fileWorker.FileWorker;
import com.kondak.fileWorker.IFileWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * class Run initiates fileWorker, launches text file reading/writing
 */
public class Run {
    private static final Logger log = LogManager.getLogger();
    private static final String PATH = "src/main/resources/";
    private static final String FILENAME = "text.txt";
    private static final String RESULT_PATH = "result/";
    private static final String RESULT_FILENAME = "output.txt";

    public static void main(String[] args) {
        log.info("Starting program");
        IFileWorker fileWorker = new FileWorker();
        fileWorker.writeFile(RESULT_PATH, RESULT_FILENAME, fileWorker.readFile(PATH, FILENAME));
        log.info("Program completed successfully");
    }
}
