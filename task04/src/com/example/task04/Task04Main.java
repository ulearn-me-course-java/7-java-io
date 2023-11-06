package com.example.task04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        double result = 0;

        while (scanner.hasNext()) {
            try {
                result += Double.parseDouble(scanner.next());
            } catch (NumberFormatException ignored) {

            }
        }

        System.out.printf(Locale.ENGLISH, "%.6f", result);
    }
}
