package com.example.task03;

import org.assertj.core.internal.Lists;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream == null || charset == null)
            throw new IllegalArgumentException();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset))) {
            return reader.readLine();
        }
    }
}
