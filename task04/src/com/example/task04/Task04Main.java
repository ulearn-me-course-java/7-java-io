package com.example.task04;

import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        String originalInput = getInput();
        String[] inputAfterSplit = originalInput.split("[ \n]");
        double result = 0D;
        for (String numberAsString : inputAfterSplit) {
            try {
                result += Double.parseDouble(numberAsString);
            } catch (NumberFormatException ex) {
                //ignore
            }
        }
        System.out.printf(Locale.US, "%.6f", result);
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        try {
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(" ");
            }
        } catch (NoSuchElementException ex) {
            return "0.0";
        }
        return sb.toString();
    }
}
