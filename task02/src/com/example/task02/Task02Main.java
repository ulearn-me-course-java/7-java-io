package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        while (prev > 0) {
            int current = System.in.read();
            if (current == 10 && prev == 13) {
                prev = current;
                continue;
            }
            System.out.write(prev);
            prev = current;
        }
        System.out.flush();
    }
}
