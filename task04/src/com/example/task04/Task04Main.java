package com.example.task04;

import java.io.*;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.stream.Collectors;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        findNumbers(System.in);
    }

    public static void findNumbers(InputStream inputStream) {
        List<String> textStrings = new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.toList());
        double sum = 0.0;
        for (String str : textStrings) {
            String[] words = str.split("\\s");
            for (String word : words) {
                try {
                    double nextValue = Double.parseDouble(word);
                    sum += nextValue;
                } catch (NumberFormatException | IllegalFormatException ignored) {
                }
            }
        }
        System.out.println(String.format("%.6f", sum).replace(',', '.'));
    }
}
