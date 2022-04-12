package com.example.task04;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        try{
            System.setIn(new FileInputStream("task04/src/com/example/task04/input.test"));
        } catch (IOException ignored) {
        }

        double result = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }

        //System.out.println(result);
        System.out.printf(Locale.UK, "%.6f", result);
    }
}
