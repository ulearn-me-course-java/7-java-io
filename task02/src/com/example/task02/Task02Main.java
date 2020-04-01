package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        byte[] buf = new byte[2];

        if (System.in.read(buf, 0, 1) == -1)
            return;

        while (System.in.read(buf, 1, 1) > 0) {
            if (!(buf[0] == 0x0d && buf[1] == 0x0a)) {
                System.out.write(buf[0]);
            }
            buf[0] = buf[1];
        }
        System.out.write(buf[0]);
    }
}
