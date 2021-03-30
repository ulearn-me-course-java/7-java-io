package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0d;
        while (scanner.hasNext()){
            try {
                result += Double.parseDouble(scanner.next());
            }
            catch (Exception ignored) { }
        }

        System.out.println(String.format(Locale.US, "%.6f", result));
    }
}
