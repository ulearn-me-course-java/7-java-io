package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        if (inputStream == null){
            throw new IllegalArgumentException();
        }
        return new BufferedReader(new InputStreamReader(inputStream,charset)).readLine();
    }
}
