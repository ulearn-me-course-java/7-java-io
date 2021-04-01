package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        int value = inputStream.read();

        while (value != -1) {
            sum = Integer.rotateLeft(sum, 1) ^ (byte) value;
            value = inputStream.read();
        }

        return sum;
    }

}
