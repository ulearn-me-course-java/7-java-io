package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream was null");
        }

        byte[] arr = new byte[1024];
        int len = inputStream.read(arr);
        return getSum(arr, len - 1);
    }

    public static int getSum(byte[] arr, int byteIndex) {
        if (byteIndex <= 0) return arr[0];
        return Integer.rotateLeft(getSum(arr, byteIndex - 1), 1) ^ arr[byteIndex];
    }
}
