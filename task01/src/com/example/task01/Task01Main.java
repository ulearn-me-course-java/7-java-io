package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        if(inputStream == null) throw new IllegalArgumentException("Input Stream is empty");
        int b = inputStream.read();
        while (b >= 0) {
            sum = Integer.rotateLeft(sum, 1) ^ b;
            b = inputStream.read();
        }
        return sum;
    }
}
