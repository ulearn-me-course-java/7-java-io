package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();
        List<Integer> list = readValues(inputStream);
        return myFun(list.size(), list);
    }

    private static List<Integer> readValues(InputStream inputStream) throws IOException {
        List<Integer> list = new ArrayList<>();
        int value;
        while ((value = inputStream.read()) != -1) {
            list.add(value);
        }
        return list;
    }

    private static int myFun(int n, List<Integer> buf){
        return n == 0 ? 0 :
                Integer.rotateLeft(myFun(n - 1, buf), 1) ^ buf.get(n - 1);
    }
}
