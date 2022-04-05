package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        try {
            StringBuilder str = new StringBuilder();
            Reader reader = new InputStreamReader(inputStream, charset);
            int readedByteCount;
            char[] chars = new char[10];

            while ((readedByteCount = reader.read(chars)) != -1) {
                for (int i = 0; i < readedByteCount; i++)
                    str.append(chars[i]);
            }

            return str.toString();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }
}
