package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev, cur = System.in.read();
        while (cur > -1) {
            prev = cur;
            cur = System.in.read();
            if (!((prev == 0x0D) && (cur == 0x0A)))
                System.out.write(prev);
        }
        System.out.flush();
    }
}
