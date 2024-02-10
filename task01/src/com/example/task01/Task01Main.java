package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException { }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }

        int checksum = 0;
        int input = inputStream.read();

        while (input != -1) {
            checksum = Integer.rotateLeft(checksum, 1) ^ input;
            input = inputStream.read();
        }
        return checksum;
    }
}
