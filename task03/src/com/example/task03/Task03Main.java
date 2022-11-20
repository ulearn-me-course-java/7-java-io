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
        if (inputStream == null) throw new IllegalArgumentException();
        if (charset == null) throw new IllegalArgumentException();

        ByteArrayOutputStream byteS = new ByteArrayOutputStream();
        int read = inputStream.read();
        while (read > -1) {
            byteS.write(read);
            read = inputStream.read();
        }
        byte[] byteA = byteS.toByteArray();
        byteS.close();
        return new String(byteA, charset);

    }
}
