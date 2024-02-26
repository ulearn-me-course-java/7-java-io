package com.example.task04;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        //InputStream in = Files.newInputStream(Paths.get("task04/src/com/example/task04/input.test"));
        //count(System.in);
        /*Scanner sc = new Scanner(System.in).useLocale(Locale.UK);

        double sum = 0.0d;
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
        }

        System.out.print(String.format(Locale.UK,"%.6f", sum));*/

        InputStream in = System.in;
        if (in == null) {
            throw new IllegalArgumentException();
        }
        Scanner scanner = new Scanner(in);
        double sum = 0.0d;
        while (scanner.hasNext()) {
            try {
                sum += Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {}
        }
        System.out.print(String.format(Locale.UK,"%.6f", sum));
    }

    public static void count(InputStream in) {
        if (in == null) {
            throw new IllegalArgumentException();
        }
        Scanner scanner = new Scanner(in);
        double sum = 0.0d;
        while (scanner.hasNext()) {
            sum += Double.parseDouble(scanner.next());
        }
        System.out.printf("%.6f%n", sum);

        /*while (scanner.hasNext()){
            if(scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            }
            else {
                scanner.next();
            }
        }*/

    }
}
