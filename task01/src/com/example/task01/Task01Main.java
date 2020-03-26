package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x01, 0x00, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException{
        if (inputStream == null)
            throw new IllegalArgumentException();

        int sum = 0;
        int b = inputStream.read();

        while (b != -1){
            sum = Integer.rotateLeft(sum, 1) ^ b;
            b = inputStream.read();
        }
        return sum;
    }
}
