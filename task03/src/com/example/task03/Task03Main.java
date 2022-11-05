package com.example.task03;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
        if(inputStream==null||charset==null) throw new IllegalArgumentException();
        byte[] array=toByteArray(inputStream);
        return new String(array,charset);
    }

    public static byte[] toByteArray(InputStream in) throws IOException
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[1];
        int nowElem;

        // считываем байты из входного потока и сохраняем их в буфере
        while ((nowElem = in.read(buffer)) != -1)
        {
            // записываем байты из буфера в выходной поток
            byteArrayOutputStream.write(buffer, 0, nowElem);
        }

        return byteArrayOutputStream.toByteArray();
    }
}
