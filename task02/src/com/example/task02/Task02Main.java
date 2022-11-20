package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previous = System.in.read();
        while (previous > 0) {
            int current = System.in.read();
            if (previous != 13 || current != 10)
                System.out.write(previous);
            previous = current;
        }
        System.out.flush();
    }
}
