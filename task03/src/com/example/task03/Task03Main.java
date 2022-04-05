package com.example.task03;
import java.nio.file.Files;
import java.nio.file.Files.*;
//import org.assertj.core.util.Files;
import java.io.IOException;
import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream == null || charset == null)
            throw new IllegalArgumentException("один из переданных аргументов null");
        InputStreamReader reader= new InputStreamReader(inputStream, charset);
        return new BufferedReader(reader).readLine();
    }
}
