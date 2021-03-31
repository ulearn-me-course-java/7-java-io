package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        System.out.println(String.format("%.6f", sum(System.in)).replace(',', '.'));
    }

    public static double sum(InputStream inputStream) {
        Scanner in = new Scanner(inputStream);

        double sum = 0;
        while (in.hasNext()) {
            try {
                sum += Double.parseDouble(in.next());
                // in.hasNextDouble + in.nextDouble выдают неподходящий под тесты ответ (nextDouble использует не double.parseDouble?)
            } catch (Exception e) {}
        }

        return sum;
    }

}
