package com.example.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream == null) {
            throw new IllegalArgumentException();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset));
        return reader.readLine();
    }
}
