package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previous = System.in.read();
        while (previous != -1) {
            int current = System.in.read();
            if (previous != '\r' || current != '\n') {
                System.out.write(previous);
            }
            previous = current;
        }
        System.out.flush();
    }
}
