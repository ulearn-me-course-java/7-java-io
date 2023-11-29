package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream == null || charset == null){
            throw new IllegalArgumentException();
        }

        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder result = new StringBuilder();
        char[] readArray = new char[1024];
        int readLength = 0;
        while ((readLength = reader.read(readArray)) > 0){
            for(int i = 0; i < readLength; i++){
                result.append(readArray[i]);
            }
        }
        return result.toString();
    }
}
