package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException, IllegalArgumentException {
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException("Null argument");
        }
        InputStreamReader stream = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[128];

        int count = 0;
        do {
            count = stream.read(chars);
            sb.append(chars, 0, count);
        } while (count == chars.length);

        return sb.toString();
    }
}