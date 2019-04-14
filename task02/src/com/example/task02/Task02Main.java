package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        int currentByte = inputStream.read();
        int nextByte;
        while (currentByte > -1) {
            nextByte = inputStream.read();
            if (!(currentByte == 13 && nextByte == 10))
                outputStream.write(currentByte);
            currentByte = nextByte;
        }
        System.out.flush();
    }
}
