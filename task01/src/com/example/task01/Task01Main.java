package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int readedByte;
        int output = 0;
        try {
            while ((readedByte = inputStream.read()) != -1)
                output = Integer.rotateLeft(output, 1) ^ readedByte;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
        return output;
    }
}
