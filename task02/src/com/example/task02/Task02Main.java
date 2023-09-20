package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int currentSymbol = System.in.read();

        while (currentSymbol != -1) {
            int nextSymbol = System.in.read();
            if (currentSymbol != 13 || nextSymbol != 10) {
                System.out.write(currentSymbol);
            }

            currentSymbol = nextSymbol;
        }

        System.out.flush();

        /*
        Tests tests = new Tests();
        tests.testExample();
        tests.testEmpty();
        tests.testArrays();*/
    }
}
