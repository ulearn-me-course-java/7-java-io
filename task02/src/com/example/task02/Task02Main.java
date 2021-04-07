package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Task02Main {
    public static void main(String[] args) throws IOException { //
        int val = System.in.read();

        while (val > -1) {
            if (val == 13) {
                int prob = System.in.read();

                if (prob == 10) {
                    val = prob;
                }
                else if (prob == -1) {
                    System.out.write(val);
                    break;
                }
                else {
                    System.out.write(val);
                    val = prob;
                }
            }
            else {
                System.out.write(val);
                val = System.in.read();
            }
        }
        System.out.flush();
    }
}
