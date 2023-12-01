package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        OutputStream out = System.out;

        int cur = in.read();
        int next = in.read();

        while (cur != -1) {
            if (cur != 13 || next != 10) {
                out.write(cur);
            }
            cur = next;
            next = in.read();
        }
        out.flush();
    }
}
