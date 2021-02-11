package com.kondak.fileWorker;

import com.kondak.utils.FibonacciNumberChecker;
import com.kondak.utils.StringWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * class FileWorker can read text file reversing rows corresponding Fibonacci sequence and write to another text file
 */
public class FileWorker implements IFileWorker {
    private static final Logger log = LogManager.getLogger();

    //method readFile reads text file reversing rows corresponding Fibonacci sequence and returns List of these rows
    @Override
    public List<String> readFile(String PATH, String FILENAME) {
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader((PATH + FILENAME)))) {
            log.info("Started text file reading");
            String line;
            int ordinalLineNumber = 0;

            while ((line = reader.readLine()) != null) {
                ordinalLineNumber++;
                if (FibonacciNumberChecker.isFibonacciNumber(ordinalLineNumber)) {
                    line = new StringWorker(line).reversString();
                }
                result.add(line);
            }
            log.info("Text file successfully read");
        } catch (IOException ex) {
            log.error("Something gone wrong: " + ex.getMessage());
        }
        return result;
    }

    //method writeFile writes a list of rows to the specified text file
    @Override
    public boolean writeFile(String PATH, String FILENAME, List<String> listOfRows) {
        boolean result = false;
        try {
            if (new File(PATH).mkdirs()) {
                log.info("Path: (" + PATH + ") successfully created");
                FileWriter writer = new FileWriter(PATH + FILENAME, false);
                for (String line : listOfRows) {
                    writer.write(line);
                    writer.append('\n');
                    writer.flush();
                }
                writer.close();
                log.info("Text file successfully written");
                result = true;
            } else {
                log.error("Failed to create folder");
                throw new FileNotFoundException();
            }
        } catch (IOException ex) {
            log.error("Something gone wrong: " + ex.getMessage());
        }
        return result;
    }
}
