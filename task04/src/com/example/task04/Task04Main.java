package com.example.task04;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900


        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        double sum = 0;
        while(scanner.hasNextDouble())
        {
            sum +=scanner.nextDouble();
        }
        System.out.println(new DecimalFormat("#0.000000").format(sum).replace(',','.'));
    }
}
