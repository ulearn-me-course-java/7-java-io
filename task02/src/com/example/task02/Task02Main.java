package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        PrintStream out = System.out;

        int first = in.read();
        int second = in.read();

        while(first != -1){
            if ((first != 13 || second != 10))
                out.write(first);

            first = second;
            second = in.read();
        }

        System.out.flush();
    }
}
