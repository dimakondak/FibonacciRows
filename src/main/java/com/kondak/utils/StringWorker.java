package com.kondak.utils;

public class StringWorker {
    private final String string;

    public StringWorker(String string) {
        this.string = string;
    }

    public String reversString() {
        char[] chars = string.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; --i) {
            result.append(chars[i]);
        }
        return result.toString();
    }
}
