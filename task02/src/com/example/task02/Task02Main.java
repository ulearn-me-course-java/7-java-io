package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {

        int prevInput = System.in.read();
        while (prevInput != -1) {
            int input = System.in.read();
            if (!(prevInput == 13 && input == 10))
                System.out.write(prevInput);
            prevInput = input;
        }
        System.out.flush();
    }
}
