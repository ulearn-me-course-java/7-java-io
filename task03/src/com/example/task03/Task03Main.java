package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream==null)
            throw new IllegalArgumentException();
        try {

            Reader reader = new InputStreamReader(inputStream, charset);
            StringWriter str = new StringWriter();
            int el;
            while ((el = reader.read()) != -1)
                str.write(el);
            return str.toString();
        } catch (Exception e) {
            throw e;
        }
    }
}
