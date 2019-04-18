package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if(inputStream == null)
            throw new IllegalArgumentException();

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        try {
            int buff;
            while ((buff = inputStream.read()) != -1)
                result.write(buff);
        } finally {
            result.close();
        }

        return result.toString(charset.name());
    }
}
