package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        int prev = is.read();
        int current = is.read();

        while (prev != -1) {
            if (prev != 13 || current != 10) {
                System.out.write(prev);
            }
            prev = current;
            current = is.read();
        }
        System.out.flush();
    }
}
