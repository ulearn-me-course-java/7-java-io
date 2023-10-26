package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        int prev = inputStream.read();
        int current = inputStream.read();
        while(prev != -1){
            if(current != 10 || prev != 13){
                System.out.write(prev);
            }
            prev = current;
            current = inputStream.read();
        }
        System.out.flush();
    }
}
