package com.example.task04;
import java.io.InputStream;
import java.util.Scanner;
import java.io.IOException;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        InputStream inputStream = System.in;
        String value = Integer.toString(inputStream.read());
        double sum = 0;
        double d;
        while (value != "-1"){
            try {
                d = Double.parseDouble(value);
            } catch (NumberFormatException e) {
                d = 0.0;
            }
            sum += d;
            value = Integer.toString(inputStream.read());
        }
    }
}
