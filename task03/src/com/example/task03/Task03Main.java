package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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
        try{
            StringBuilder str = new StringBuilder();
            try(Reader reader = new BufferedReader(new InputStreamReader(inputStream, charset))){
                int c = reader.read();
                while( c != -1){
                    str.append((char) c);
                    c = reader.read();
                }
            }
            return str.toString();

        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }
}
