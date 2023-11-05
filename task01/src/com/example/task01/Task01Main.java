package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        System.out.println(checkSumOfStream(null));
        //System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        if (inputStream == null ) throw new IllegalArgumentException("Your InputStream is null");
        byte[] arr = new byte[1024];
        int inputLength = inputStream.read(arr);
        if (inputLength == 0) return 0;
        return CheckSum(arr, inputLength - 1);
    }

    public static int CheckSum(byte[] bytes, int num) {
        if (num < 0) return 0;
        if (num == 0) return bytes[0];
        return Integer.rotateLeft(CheckSum(bytes, num - 1),1) ^ bytes[num];
    }
}
