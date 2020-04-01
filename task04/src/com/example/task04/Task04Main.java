package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNext()) {
            sum += tryParseDouble(scanner.next());
        }
        System.out.append(String.format("%.6f", sum).replace(",", "."));
        System.out.flush();
    }

    private static double tryParseDouble(String str) {
        double sum;
        try {
            sum = Double.parseDouble(str);
        } catch (Exception ex) {
            return 0.0;
        }
        return sum;
    }
}
