package com.example.task04;

import java.io.InputStream;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        System.out.println(String.format("%.6f", sum(System.in)).replace(',', '.'));
    }

    public static double sum(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        double result = 0;
        while (scanner.hasNext())
            try {
                result += Double.parseDouble(scanner.next());
            }
            catch (Exception ignored) {}
        return result;
    }
}
