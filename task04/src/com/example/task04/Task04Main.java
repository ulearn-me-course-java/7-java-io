package com.example.task04;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        while(sc.hasNextDouble() ){
            double number = sc.nextDouble();
            sum+= number;
            //sc.nextDouble();
        }

        System.out.printf(Locale.US, "%.6f", sum );
    }
}