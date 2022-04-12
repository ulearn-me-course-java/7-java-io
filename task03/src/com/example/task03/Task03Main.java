package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    /*
    Метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
    Пример
    InputStream последовательно возвращает четыре байта: 48 49 50 51.
    Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
     */
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        if (inputStream == null || !Charset.isSupported(charset.toString())){
            throw new IllegalArgumentException();
        }
        return new BufferedReader(new InputStreamReader(inputStream,charset)).readLine();
    }
}
