package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        while (scanner.hasNext()) {
            String next = scanner.next();
            try {
                x += Double.parseDouble(next);
            } catch (Exception e) {
                //ignore
            }
        }
        System.out.println(String.format(/*?*/Locale.ENGLISH,"%.6f", x));
    }
}
