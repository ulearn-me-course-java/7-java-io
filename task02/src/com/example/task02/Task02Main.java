package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int curByte, nextByte;
        while ((curByte = System.in.read()) != -1)
            if (curByte == '\r')
                do {
                    if ((nextByte = System.in.read()) != '\n')
                        System.out.print((char) curByte);
                    if (nextByte != -1 && nextByte != '\r')
                        System.out.print((char) nextByte);
                    curByte = nextByte;
                } while (curByte == '\r');
            else System.out.print((char) curByte);
        System.out.flush();
    }
}
