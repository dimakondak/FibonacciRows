package com.kondak.fileWorker;

import java.util.List;

public interface IFileWorker {
    List<String> readFile(String PATH, String FILENAME);

    boolean writeFile(String PATH, String FILENAME, List<String> listOfLines);
}