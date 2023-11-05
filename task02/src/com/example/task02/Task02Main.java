package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int read = System.in.read();
        int next = System.in.read();

        while (read != -1){
            if (read != 13 || next != 10) {
                System.out.write(read);
            }
            read = next;
            next = System.in.read();
        }

        System.out.flush();
    }
}
