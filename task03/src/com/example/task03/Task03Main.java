package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(readAsString(Files.newInputStream(Paths.get("task03/src/com/example/task03/input.test")), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset)
            throws IOException {
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException();
        }
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        char[] chars = new char[inputStream.available()];
        int charsRead;
        StringBuilder sb = new StringBuilder();
        while ((charsRead = reader.read(chars)) > 0) {
            sb.append(new String(chars, 0, charsRead));
        }
        return sb.toString();
    }
}
