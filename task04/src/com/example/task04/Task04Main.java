package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {
                result += Double.parseDouble(scanner.next());
            } catch (Exception e) {

            }
        }
        System.out.printf(Locale.UK, "%.6f", result);
    }
}
