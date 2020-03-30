package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNext()) {
            String buffer = scanner.next();
            try {
                sum += Double.parseDouble(buffer);
            } catch (Exception e) {
            }
        }
        System.out.printf(Locale.ENGLISH, "%.6f", sum);
    }
}
