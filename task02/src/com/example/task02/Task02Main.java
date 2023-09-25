package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        int previous = inputStream.read();
        int current = inputStream.read();

        while (previous > -1) {

            if (previous != 13 || current != 10) {
                System.out.write(previous);
            }
            previous = current;
            current = inputStream.read();
        }

    }
}

