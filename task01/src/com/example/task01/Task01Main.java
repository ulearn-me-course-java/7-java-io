package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();

        int checkSum = inputStream.read();

        if (checkSum == -1)
            return 0;

        while (inputStream.available() > 0)
            checkSum = Integer.rotateLeft(checkSum, 1) ^ inputStream.read();

        return checkSum;
    }
}