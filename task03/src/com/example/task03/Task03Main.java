package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("task03/src/com/example/task03/input.test");
        String charset = "KOI8-R";
        System.out.println(readAsString(stream, Charset.forName(charset)));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset));

        return reader.readLine();
    }
}
