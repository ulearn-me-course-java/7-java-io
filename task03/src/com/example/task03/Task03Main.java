package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        //System.out.println(readAsString(System.in, Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException("InputStream cannot be null");
        if (charset == null) throw new IllegalArgumentException("Charset cannot be null");

        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int next;
        while ((next = inputStream.read()) != -1) {
            byteStream.write(next);
        }
        byteStream.flush();
        byte[] byteArray = byteStream.toByteArray();
        byteStream.close();

        return new String(byteArray, charset);
    }
}
