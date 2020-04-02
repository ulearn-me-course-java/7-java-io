package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream==null) throw new IllegalArgumentException();

        InputStreamReader iSR = new InputStreamReader(inputStream, charset);
        String result = "";
        int data = iSR.read();

        while (data >= 0) {
            char theChar = (char) data;
            result += theChar;
            data = iSR.read();
        }
        return result;
    }
}
