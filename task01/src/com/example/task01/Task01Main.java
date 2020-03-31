package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if(inputStream == null) throw new IllegalArgumentException();
        int n = 0;
        int i = inputStream.read();
        while (i != -1){
            n = Integer.rotateLeft(n, 1) ^ i;
            i = inputStream.read();
        }
        return n;
    }
}
