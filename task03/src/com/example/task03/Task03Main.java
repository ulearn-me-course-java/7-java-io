package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        Tests tests = new Tests();
        tests.test();
        tests.testExample();
        //tests.testNull();
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        if (inputStream == null || charset == null){
            throw new IllegalArgumentException();
        }

        InputStreamReader inputStreamReader= new InputStreamReader(inputStream, charset);
        int readArrayLength = 0;
        char[] readArray = new char[1024];

        StringBuilder result = new StringBuilder();
        while ((readArrayLength=inputStreamReader.read(readArray))>0){
            for (int i=0; i<readArrayLength;i++){
                result.append(readArray[i]);
            }
        }
        return result.toString();
    }
}
