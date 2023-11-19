package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        InputStream inputStream = System.in;
        System.out.println(String.format("%.6f", sumOfDouble(inputStream)));
    }
    public static double sumOfDouble(InputStream inputStream){
        double sum = 0;
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            try {
                sum += Double.parseDouble(scanner.next());
            } catch (Exception e) {

            }
        }
        return sum;
    }
}
