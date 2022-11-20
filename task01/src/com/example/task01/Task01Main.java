package com.example.task01;

import java.io.*;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if(inputStream == null) {
            throw new IllegalArgumentException("inputStream is NULL");
        }

        int checkSum = 0;
        int elem;
        while ((elem = inputStream.read()) != -1) {
            checkSum = Integer.rotateLeft(checkSum,1) ^ elem;
        }

        return checkSum;
    }
}
