package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        //writeSum(System.in);

        writeSum(Files.newInputStream(
                Paths.get("task04/src/com/example/task04/input.test")));
    }

    private static void writeSum(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }

        Scanner scanner = new Scanner(inputStream);

        double result = 0.0d;
        while (scanner.hasNext()) {
            try {
                result += Double.parseDouble(scanner.next());
            } catch (Exception ignored) {
            }
        }

        System.out.printf(Locale.US, "%.6f%n", result);
    }
}
