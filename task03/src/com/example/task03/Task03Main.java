package com.example.task03;

import org.assertj.core.internal.ByteArrays;

import java.awt.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        String str = "Ы";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes) {
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
