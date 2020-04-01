package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null){
            throw new IllegalArgumentException("some of argument is NULL");
        }

        ByteArrayOutputStream bytes2 = new ByteArrayOutputStream(); //поток байтов, записываемые в буфер для чтения и записи
        byte[] bytes = new byte[500];
        //создание массива байтов длинны потока(in - поток, avalible - количество чисел, которое можно считать)
        int count;
        while ((count = inputStream.read(bytes)) != -1) {
            bytes2.write(bytes, 0, count);//(byte[] array, int start, int limit)
        }
        return new String(bytes2.toByteArray(), charset); //charset - выбор кодировки


    }
}