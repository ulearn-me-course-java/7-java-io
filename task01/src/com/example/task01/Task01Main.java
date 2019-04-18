package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checksum = 0;

        if (inputStream != null) {
            checksum = inputStream.read();

            if (checksum == -1)
                return 0;

            while (inputStream.available() > 0) {
                checksum = Integer.rotateLeft(checksum, 1) ^ inputStream.read();
            }
        } else {
            throw new IllegalArgumentException();
        }

        return checksum;
    }
}