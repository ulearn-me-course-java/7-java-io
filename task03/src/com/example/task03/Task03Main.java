package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException("inputStream cannot be null");
        if (charset == null) throw new IllegalArgumentException("charset cannot be null");

        BufferedInputStream bis = new BufferedInputStream(inputStream); //накапливает вводимые данные в специальном буфере без постоянного обращения к устройству ввода.
        ByteArrayOutputStream buf = new ByteArrayOutputStream(); // входной поток, использующий в качестве источника данных массив байтов.

        for (int result = bis.read(); result != -1; result = bis.read()) {
            buf.write((byte) result);
        }

        return buf.toString(String.valueOf(charset));
    }
}
