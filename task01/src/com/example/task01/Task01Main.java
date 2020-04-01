package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        if(inputStream == null) throw new IllegalArgumentException("Input Stream is not exist");

        int dataByte = inputStream.read();
        while(dataByte >= 0) {
            sum = Integer.rotateLeft(sum, 1) ^ dataByte;
            dataByte = inputStream.read();
        }
        return sum;

    }
}
