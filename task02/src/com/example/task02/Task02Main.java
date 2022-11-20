package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in; // это простая статическая переменная типа InputStream

        int current = inputStream.read();
        int next = inputStream.read();

        while (current != -1) {
            if (!(current == 13 && next == 10)) System.out.write(current);
            current = next;
            next = inputStream.read();
        }
        System.out.flush();
    }
}
