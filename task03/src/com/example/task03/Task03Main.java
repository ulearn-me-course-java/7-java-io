package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream is null");
        }
        Reader reader = new InputStreamReader(inputStream, charset);
        int intValueOfChar;
        String targetString = "";
        while ((intValueOfChar = reader.read()) > -1) {
            targetString += (char) intValueOfChar;
        }
        reader.close();
        return targetString;
    }
}
