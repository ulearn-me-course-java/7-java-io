package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x25})));


    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        try {
            int sum = 0;
            int n = inputStream.read();
            while (n > -1) {
                sum = Integer.rotateLeft(sum, 1) ^ n;
                n = inputStream.read();
            }
            return sum;
        }catch (NullPointerException e){
            throw new IllegalArgumentException();
        }
    }
}
