package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.util.Scanner;

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
        if (inputStream == null || charset == null)
            throw new IllegalArgumentException();

        StringBuilder resultat = new StringBuilder();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream, charset));

        while (scanner.hasNext())
        {
            resultat.append(scanner.next());
        }
        return resultat.toString();
    }
}
