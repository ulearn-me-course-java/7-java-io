package com.example.task03;

import sun.misc.IOUtils;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException, IllegalArgumentException {
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder out = new StringBuilder();
        int cByte;
        while ((cByte = reader.read()) != -1) {
            out.append((char) cByte);
        }
        return out.toString();
    }
}
