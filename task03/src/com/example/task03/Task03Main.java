package com.example.task03;

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
        if(charset == null || inputStream == null) {
            throw new IllegalArgumentException();
        }
        int input = inputStream.read();
        List<Integer> bytes = new ArrayList<>();
        while(input != -1) {
            bytes.add(input);
            input = inputStream.read();
        }
        byte[] resultBytes = new byte[bytes.size()];
        for(int i = 0; i < bytes.size(); i++) {
            resultBytes[i] = (byte)((int)(bytes.get(i)));
        }
        return new String(resultBytes, charset);
    }
}
