package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        printTotalAmount();
    }

    private static void printTotalAmount() throws IOException {
        double totalAmount = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in, Charset.defaultCharset());
        List<String> lineList = new BufferedReader(inputStreamReader).lines()
                                                                     .collect(Collectors.toCollection(ArrayList::new));

        for (String line : lineList) {
            String[] stringList = line.split("[\\s\\t]+");
            double currentSum = getCurrentSum(stringList);
            totalAmount += currentSum;
        }

        byte[] buffer = String.format("%.6f", totalAmount).replace(',', '.').getBytes();
        System.out.write(buffer);
    }

    private static double getCurrentSum(String[] stringList) {
        return Arrays.stream(stringList)
                     .mapToDouble(Task04Main::doubleTryParse)
                     .filter(p -> !Double.isNaN(p))
                     .sum();
    }

    private static double doubleTryParse(String str) {
        double value;
        try {
            value = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            value = Double.NaN;
        }
        return value;
    }

}
