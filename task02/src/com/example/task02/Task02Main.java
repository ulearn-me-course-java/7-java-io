package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        toUnixNotation(System.in);
    }

    private static void toUnixNotation(InputStream inputStream) throws IOException {
        StringBuilder line = new StringBuilder();
        int chr = inputStream.read();
        while(chr != -1) {
            line.append((char) chr);
            chr = inputStream.read();
        }
        System.out.print(line.toString().replaceAll("\r\n", "\n"));
    }
}
