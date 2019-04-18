package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checksum = 0;

        if (inputStream != null) {
            while (inputStream.available() > 0) {
                int pos = 0;
                byte[] inputArray = new byte[inputStream.available() % 1024];
                inputStream.read(inputArray);
                while (pos < inputArray.length) {
                    checksum = Integer.rotateLeft(checksum, 1) ^ inputArray[pos++];
                }
            }
        } else {
            throw new IllegalArgumentException();
        }

        return checksum;
    }
}