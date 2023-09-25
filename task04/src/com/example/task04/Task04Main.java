package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in).useLocale(Locale.UK);

        double sum = 0d;
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
        }

        System.out.print(String.format(Locale.UK,"%.6f", sum));

    }
}
