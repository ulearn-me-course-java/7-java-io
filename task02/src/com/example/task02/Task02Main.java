package com.example.task02;

import java.io.IOException;
import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("task02/src/com/example/task02/input.test");
        OutputStream outputStream = new FileOutputStream("task02/src/com/example/task02/output.test");

        //InputStream inputStream = System.in;
        //OutputStream outputStream = System.out;
        int previous = inputStream.read();
        int current = inputStream.read();
        while (previous > -1) {
            if(!(previous == 13 && current == 10)) {
                outputStream.write(previous);
            }
            previous = current;
            current = inputStream.read();
        }
        outputStream.flush();
    }
}
