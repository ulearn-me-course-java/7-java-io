package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(Files.newInputStream(Paths.get("task03/src/com/example/task03/input.test")),
                Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException();
        return new BufferedReader(new InputStreamReader(inputStream, charset)).readLine();
    }
}
