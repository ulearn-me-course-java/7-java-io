package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        try {

            int current = System.in.read();

            while (current != -1) {
                int next = System.in.read();

                if (next == -1) {
                    System.out.write(current);
                    break;
                }

                if (current == '\r' && next == '\n') {
                    System.out.write(next);
                    next = System.in.read();
                } else
                    System.out.write(current);

                current = next;
            }
        } catch (Exception ex) {
            System.out.println("Exception : " + ex);
        }

        System.out.flush();
    }
}
