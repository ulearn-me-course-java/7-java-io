package com.example.task04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException
    {
        try{
            System.setIn(Files.newInputStream(Paths.get("task04\\src\\com\\example\\task04\\input.test")));
        } catch (IOException ignored) {
        }
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double result = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf(Locale.ENGLISH, "%,6f%n", result);

    }
}
