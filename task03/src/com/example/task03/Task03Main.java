package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset)
    {
        // your implementation here
        if(inputStream == null || charset == null)
            throw new IllegalArgumentException();

        StringBuilder encodedString = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset))){
            String line;

            while((line = reader.readLine()) != null){
                encodedString.append(line);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }

        return encodedString.toString();
    }
}
