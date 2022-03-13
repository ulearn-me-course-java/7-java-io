package com.example.task03;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        try {
            byte[] array = IOUtils.readAllBytes(inputStream);
            return new String(array, charset);
        }
        catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }
}
