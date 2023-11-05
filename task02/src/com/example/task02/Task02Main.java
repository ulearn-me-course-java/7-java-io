package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        int cur = inputStream.read();
        int next = inputStream.read();
        while (cur != -1){
            if (cur != 13 || next != 10){
                System.out.write(cur);
            }
            cur = next;
            next = inputStream.read();
        }
        System.out.flush();
    }
}