package com.example.task03;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException
    {
        if (inputStream == null || charset == null) throw new IllegalArgumentException();

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream())
        {
            FillOutputStream(outputStream, inputStream);
            byte[] byteArray = outputStream.toByteArray();
            return new String(byteArray, charset);
        }
    }

    private static void FillOutputStream(ByteArrayOutputStream outputStream, InputStream inputStream) throws IOException
    {
        int next;
        while ((next = inputStream.read()) != -1) outputStream.write(next);
        outputStream.flush();
    }
}
