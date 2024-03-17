package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        int prev = inputStream.read();
        int current = inputStream.read();

        while(prev != -1){
            if ((prev != 13 || current != 10)){
                outputStream.write(prev);
            }
            prev = current;
            current = inputStream.read();
        }

        System.out.flush();
    }
}
