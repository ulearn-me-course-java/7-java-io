package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(Files.newInputStream
                        (Paths.get("task03/src/com/example/task03/input.test")),
                Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        if (inputStream == null) throw new IllegalArgumentException();

        StringBuilder stringBuilder = new StringBuilder();
        try (InputStreamReader reader = new InputStreamReader(inputStream, charset)) {
            int readByte;
            while ((readByte = reader.read()) != -1) {
                stringBuilder.append((char) readByte);
            }
        }
        return stringBuilder.toString();
    }

}