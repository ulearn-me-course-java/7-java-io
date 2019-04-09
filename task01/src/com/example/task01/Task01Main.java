package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    static void check(byte[] x, int output) throws IOException {
        try (ByteArrayInputStream in = new ByteArrayInputStream(x)) {
            checkSumOfStream(in);
        }
    }

    public static void main(String[] args) throws IOException {
        checkSumOfStream(null);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if(inputStream == null){throw  new IllegalArgumentException();}

        int c = inputStream.read();
        int buff;

        if (c == -1) {
            return 0;
        }

        while ((buff = inputStream.read()) != -1) {
            c = Integer.rotateLeft(c, 1) ^ buff;
        }

        return c;
    }
}
