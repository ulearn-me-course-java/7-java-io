package com.example.task03;

import java.nio.charset.Charset;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(Files.newInputStream(Paths.get("task03/src/com/example/task03/input.test")),
                Charset.forName("KOI8-R")));

        Tests tests = new Tests();
        tests.testExample();
        tests.test();
        //tests.testNull();
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException();
        }

        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();

        int value;
        while ((value = reader.read()) != -1) {
            stringBuilder.append((char)value);
        }

        return stringBuilder.toString();
    }
}
