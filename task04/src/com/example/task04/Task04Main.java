package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        //float не подошел, на тестах по точности валится
        double result = 0.0;

        while (scanner.hasNextDouble())
            result+=scanner.nextDouble();


        System.out.printf(Locale.ENGLISH,"%.6f",result);
    }
}
