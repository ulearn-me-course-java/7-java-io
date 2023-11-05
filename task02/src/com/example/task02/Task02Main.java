package com.example.task02;

import java.io.FileInputStream;
import java.io.IOException;

public class Task02Main {

    private static boolean isTest = false;

    public static void main(String[] args) throws IOException {
        /*
        FileInputStream fileInputStream = new FileInputStream("task02/src/com/example/task02/input.test");
        System.setIn(fileInputStream);
        convertStringWindowsToUnix();
         */

        if (isTest) {
            convertStringWindowsToUnix();
        } else {
            test();
        }
    }

    private static void convertStringWindowsToUnix() throws IOException {
        int currentSymbol = System.in.read();
        while (currentSymbol != -1) {
            int nextSymbol = System.in.read();
            if (currentSymbol != 13 || nextSymbol != 10) {
                System.out.write(currentSymbol);
            }

            currentSymbol = nextSymbol;
        }

        System.out.flush();
    }

    private static void test() throws IOException {
        isTest = true;
        Tests tests = new Tests();
        tests.testExample();
        tests.testEmpty();
        tests.testArrays();
    }
}
