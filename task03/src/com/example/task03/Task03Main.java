package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        if (inputStream == null) {
            throw new IllegalArgumentException();
        }

        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder res = new StringBuilder();
        char[] buffer = new char[inputStream.available()];
        int symbolsNum;
        symbolsNum = reader.read(buffer);
        res.append(new String(buffer, 0, symbolsNum));


        return res.toString();
    }
}
