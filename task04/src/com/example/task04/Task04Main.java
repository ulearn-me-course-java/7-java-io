package com.example.task04;

import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double d = 0d;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                d += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.print(String.format("%.6f", d).replace(',', '.'));
        scanner.close();
    }
}
