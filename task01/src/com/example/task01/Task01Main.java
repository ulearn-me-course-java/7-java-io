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
        ArrayList<Integer> list = new ArrayList<>();
        int num = inputStream.read();
        int sum = 0;

        while(num > -1){
            sum = Integer.rotateLeft(sum, 1) ^ num;
            num = inputStream.read();
        }

        return sum;
    }
}
