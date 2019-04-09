package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.ByteArrayOutputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream == null) {throw new IllegalArgumentException();}

        int c;

        ByteArrayOutputStream arr = new ByteArrayOutputStream();

        while ((c = inputStream.read()) != -1) { arr.write(c); }

        return arr.toString(charset.name());
    }
}
