package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int readedByte;
        int lastByte = 0;
        while ((readedByte = System.in.read()) != -1) {
            if (lastByte == 13 && readedByte != 10)
                System.out.write(13);

            lastByte = readedByte;

            if (readedByte != 13)
                System.out.write(readedByte);
        }
        if (lastByte == 13)
            System.out.write(13);

        System.out.flush();
    }
}
