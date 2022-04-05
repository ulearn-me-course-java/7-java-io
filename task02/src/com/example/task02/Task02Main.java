package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int readByte = System.in.read();

        while (readByte > -1) {
            if (readByte == 13) {
                int temp = System.in.read();

                if (temp == 10) {
                    readByte = temp;
                }
                else if (temp == -1) {
                    System.out.write(readByte);

                    break;
                }
                else {
                    System.out.write(readByte);
                    readByte = temp;
                }
            }
            else {
                System.out.write(readByte);
                readByte = System.in.read();
            }
        }
        System.out.flush();
    }
}
