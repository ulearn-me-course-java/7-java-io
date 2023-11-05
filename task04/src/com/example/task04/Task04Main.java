package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args)  {
        Sum(System.in);
    }

    public static void Sum(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream).useLocale(Locale.US);;

        double sum = 0.0;
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
        }

        System.out.printf(Locale.US, "%.6f", sum);
    }
}
