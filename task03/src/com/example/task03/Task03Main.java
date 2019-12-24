package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.io.DataInputStream;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException();
        }

        byte[] buf = new byte[inputStream.available()];
        int resive = inputStream.read(buf);
        return new String(buf, charset);
    }
}
