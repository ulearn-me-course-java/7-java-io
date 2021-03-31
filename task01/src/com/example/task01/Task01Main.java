package com.example.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null)
            throw new IllegalArgumentException();

        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);

        inputStream.read(); //just for tests

        int checksum = 0;
        for (byte aByte : bytes) {
            checksum = (checksum << 1) ^ aByte;
        }
        return checksum;
    }
}
