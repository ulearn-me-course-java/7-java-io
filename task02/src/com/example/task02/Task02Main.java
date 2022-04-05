package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int next = System.in.read();
        int last = 0;

        while (next != -1) {
            switch (next){
                case '\n':
                    System.out.write(next);
                    break;
                case '\r':
                    if (last == '\r')
                        System.out.write(last);
                    break;
                default:
                    if (last == '\r')
                        System.out.write(last);
                    System.out.write(next);
                    break;
            }
            last = next;
            next = System.in.read();
        }
        if (last == '\r')
            System.out.write(last);

        System.out.flush();

    }
}
