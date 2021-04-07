package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || !Charset.isSupported(charset.toString())) {
            throw new IllegalArgumentException();
        }
        return new BufferedReader(new InputStreamReader(inputStream,charset)).readLine();
    }
}
