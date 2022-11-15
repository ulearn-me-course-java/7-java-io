package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.nio.charset.Charset;
import java.util.stream.Collectors;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null | charset == null) throw new IllegalArgumentException();

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        int temp = inputStream.read();
        while(temp != -1) {
            byteArr.write((byte) temp);
            temp = inputStream.read();
        }
        return byteArr.toString(charset);
    }
}
