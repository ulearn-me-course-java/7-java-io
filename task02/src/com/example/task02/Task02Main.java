package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int[] buf = new int[2];
        buf[0] = System.in.read();
        while(buf[0] > 0) {
            buf[1] = System.in.read();
            if(!(buf[0] == 13 && buf[1] == 10)) {
                System.out.write(buf[0]);
            }
            buf[0] = buf[1];
        }
        System.out.flush();
    }
}