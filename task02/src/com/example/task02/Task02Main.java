package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get("task02/src/com/example/task02/input.test"));
        OutputStream outputStream = Files.newOutputStream(Paths.get("task02/src/com/example/task02/output.test"));
        int previousByte = inputStream.read();
        while (previousByte != -1) {
            int currentByte = inputStream.read();
            if (previousByte != 13 || currentByte != 10) {
                outputStream.write(previousByte);
            }
            previousByte = currentByte;
        }
        outputStream.flush();
    }
}
