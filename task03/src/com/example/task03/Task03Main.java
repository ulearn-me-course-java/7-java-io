package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
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
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();

        List<Byte> byteList = new ArrayList<>();
        int input;

        while ((input = inputStream.read()) != -1)
            byteList.add((byte)input);

        byte[] bytes = new byte[byteList.size()];
        for (int i = 0; i < bytes.length; i++)
            bytes[i] = byteList.get(i);

        return new String(bytes, charset);
    }
}
