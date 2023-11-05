package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        //System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

        Tests tests = new Tests();

        tests.testArrays();
        tests.testExample();
        //tests.testException();
        //tests.testNull();

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }
        int res = 0;
        int readLength = 0;
        byte[] b = new byte[1024];
        while ((readLength = inputStream.read(b)) > 0) {
            for (int i = 0; i < readLength; i++) {
                res = Integer.rotateLeft(res, 1) ^ b[i];
            }
        }
        return res;
    }
}
