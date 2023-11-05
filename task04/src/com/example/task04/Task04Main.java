package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    private static boolean isTest = false;

    public static void main(String[] args) throws IOException {
        if (isTest) {
            writeSum(System.in);
        } else {
            test();
        }

        //writeSum(Files.newInputStream(Paths.get("task04/src/com/example/task04/input.test")));
    }

    private static void writeSum(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }

        Scanner scanner = new Scanner(inputStream);

        double result = 0d;
        while (scanner.hasNext()) {
            try {
                result += Double.parseDouble(scanner.next());
            } catch (Exception ignored) {
            }
        }

        System.out.printf(Locale.ENGLISH, "%.6f", result);
    }

    private static void test() throws IOException {
        isTest = true;
        Tests tests = new Tests();
        tests.testExample();
        tests.testEmpty();
    }
}
