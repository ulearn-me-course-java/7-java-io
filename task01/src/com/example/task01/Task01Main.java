package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null){
            throw new IllegalArgumentException();
        }
        int current = inputStream.read();
        int checkSum = 0;
        while (current >= 0) {
            checkSum = Integer.rotateLeft(checkSum, 1) ^ current;
            current = inputStream.read();
        }
        return checkSum;
        //C[n+1]=rotateLeft(C[n]) xor b[n+1]
    }
}