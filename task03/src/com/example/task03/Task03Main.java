package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Task03Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException
    {
        if (inputStream == null)
            throw new IllegalArgumentException();
        int v;
        ArrayList<Byte> buffer = new ArrayList<>();
        while ((v = inputStream.read()) != -1)
            buffer.add((byte) v);
        byte[] bytes = new byte[buffer.size()];
        for (int i = 0; i < buffer.size(); i++)
            bytes[i] = buffer.get(i);
        return new String(bytes, charset);
    }
}
