package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.System.in;
import static java.lang.System.out;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        Scanner scanner = new Scanner(in).useRadix(6);
        double sum = 0.000000;
        String next;
        while (scanner.hasNext()) {
            next = scanner.next();
            if (isNumber(next))
                sum = sum + parseDouble(next);
        }
        out.printf(Locale.US, "%6f", sum);
        scanner.close();
    }
    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}