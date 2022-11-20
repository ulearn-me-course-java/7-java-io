package com.example.task04;

import java.io.IOException;
import java.io.InputStream;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        InputStream reading = System.in;
        String readValue = Integer.toString(reading.read());
        double sumDub = 0;
        double numDub = 0.0;

        while (readValue != "-1") {

            try {
                numDub = Double.parseDouble(readValue);
            } catch (NumberFormatException e) {
                numDub = 0.0;
            }
            sumDub += numDub;
            readValue = Integer.toString(reading.read());

        }
        System.out.println(String.format("%.6f", sumDub));
    }
}
