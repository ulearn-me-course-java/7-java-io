package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int res = 0;
        int data;
        if (inputStream == null) throw new IllegalArgumentException("Stream empty");

        while((data = inputStream.read()) >= 0){
            res = Integer.rotateLeft(res, 1) ^ data;
        }

        return  res;
    }
}
