package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        double sum = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cur;

        while ((cur = reader.readLine()) != null) {
            for (String num : cur.split(" ")) {
                sum += tryParseDouble(num);
            }
        }

        System.out.printf(Locale.ENGLISH, "%.6f", sum);
    }

    public static double tryParseDouble(final String number) {

        double result;
        try {
            result = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            result = 0.0;
        }
        return result;
    }
}
