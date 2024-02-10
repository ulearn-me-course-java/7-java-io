package com.example.task02;

import java.io.*;
import java.nio.file.Files;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        /*System.setIn(Files.newInputStream(new File("task02/src/com/example/task02/input.test").toPath()));
        System.setOut(new PrintStream("task02/src/com/example/task02/output.test"));*/

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        int prevByte = inputStream.read();
        int currentByte = inputStream.read();

        while (currentByte != -1) {
            if (prevByte != 13 && currentByte != 10) {
                outputStream.write(prevByte);
            }

            prevByte = currentByte;
            currentByte = inputStream.read();
        }

        outputStream.write(prevByte);

        outputStream.flush();
    }
}