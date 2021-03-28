package com.example.task02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        convertStream();
    }

    public static void convertStream() throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        int input = inputStream.read();
        List<Integer> bytes = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        while (input != -1) {
            bytes.add(input);
            input = inputStream.read();
        }
        for(int i = 0; i < bytes.size(); i++) {
            if(bytes.get(i) == 10 && i > 0 && bytes.get(i - 1) == 13) {
                result.remove(result.size() - 1);
            }
            result.add(bytes.get(i));
        }
        byte[] output = new byte[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = (byte)((int) result.get(i));
        }
        outputStream.write(output);
        outputStream.flush();
    }
}
