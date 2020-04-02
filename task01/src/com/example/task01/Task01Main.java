package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if(inputStream == null) throw new IllegalArgumentException();
        int sum = 0, chunk;
        while ((chunk = inputStream.read()) >= 0) sum = Integer.rotateLeft(sum,1) ^ chunk;
        return sum;
    }
}
