package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Stack;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        if (System.in == null) throw new IllegalArgumentException();

        double result = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int c = System.in.available(); c > -1; c--) {
            char current = (char) System.in.read();
            if (current == ' ' || current == '\n' || c == 0) {
                try {
                    result += Double.parseDouble(stringBuilder.toString());
                } catch (NumberFormatException e) {

                }
                stringBuilder.setLength(0);
            } else {
                stringBuilder.append(current);
            }
        }
        System.out.format(Locale.US, "%.6f", result);
    }
}
