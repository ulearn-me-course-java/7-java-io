package com.example.task03;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }
    
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream cannot be null");
        }
        if (charset == null) {
            throw new IllegalArgumentException("Charset cannot be null");
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int next;
        while ((next = inputStream.read()) != -1) {
            bos.write(next);
        }
        bos.flush();
        byte[] byteArray = bos.toByteArray();
        bos.close();
        return new String(byteArray, charset);
    }
}
