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

        ByteArrayOutputStream res = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int l;

        while ((l = inputStream.read(buffer)) > -1) {
            res.write(buffer, 0, l);
        }

        return res.toString(charset.toString());
    }
}
