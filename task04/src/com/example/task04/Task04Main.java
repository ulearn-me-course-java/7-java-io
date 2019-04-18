package com.example.task04;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
// чтобы протестировать свое решение, вам нужно:
// - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
// - запустить программу
// - проверить, что получилось 351.731900

        Scanner scan = new Scanner(System.in);

        double sum = 0;
        while (scan.hasNext()) {
            String line = scan.nextLine();

            String[] splitStr = line.split(" ");

            for (String word : splitStr) {
                try {
                    sum += Double.parseDouble(word);
                } catch (Exception ex) {
                    continue;
                }
            }
        }

        System.out.println(new DecimalFormat("#0.000000").format(sum).replace(',', '.'));
    }
}