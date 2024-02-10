package com.example.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        String str = "ы";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for(byte b : bytes) {
            System.out.println(256 + b);
        }
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null) throw new IllegalArgumentException();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }
}
