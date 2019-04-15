package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int resultSum;
        int buff;
        if(inputStream != null){
            resultSum = inputStream.read();
            if(resultSum == -1){
                return 0;
            }
            buff = inputStream.read();
            while (buff != -1){
                resultSum = Integer.rotateLeft(resultSum, 1) ^ buff;
                buff = inputStream.read();
            }
            return resultSum;
        }
        throw new IllegalArgumentException();
    }
}
