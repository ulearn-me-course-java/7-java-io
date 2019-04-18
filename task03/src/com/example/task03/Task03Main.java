package com.example.task03;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException();
        try(ByteArrayOutputStream result = new ByteArrayOutputStream()) {
            int symbol;
            while ((symbol = inputStream.read()) != -1) {
                result.write(symbol);
            }
            return result.toString(charset.name());
        }
    }
}
