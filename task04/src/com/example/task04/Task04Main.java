package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
        double sum = 0;
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
        }
        System.out.println(String.format(Locale.ROOT, "%.6f", sum));
    }
}
