package com.example.task04;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        while(scanner.hasNext()){
            if(scanner.hasNextDouble()){
                result += scanner.nextDouble();
            }
            else{
                scanner.next();
            }
        }
        System.out.format(Locale.ENGLISH, "%1.6f", result);
    }
}
