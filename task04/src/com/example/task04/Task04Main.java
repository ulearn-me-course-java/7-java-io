package com.example.task04;

import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNext()) {
            sum += tryParseDouble(scanner.next());
        }

        System.out.append(String.format("%.6f", sum).replace(",", "."));
        System.out.flush();
    }

    static double tryParseDouble(String s) {
        double result;
        try {
            result = Double.parseDouble(s);
        } catch (Exception ex) {
            return 0.0;
        }
        return result;
    }
}
