package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream != null)
            throw new IllegalArgumentException();

        int checksum = inputStream.read();
        if (checksum == -1)
            return 0;
        while (inputStream.available() > 0)
            checksum = Integer.rotateLeft(checksum, 1) ^ inputStream.read();
        return checksum;
    }
}