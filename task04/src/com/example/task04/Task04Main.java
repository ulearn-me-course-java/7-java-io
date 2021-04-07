package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double result = 0;
        while (scanner.hasNext()){
            if(scanner.hasNextDouble()){
                result += Double.parseDouble(scanner.next());
            }
            else{
                scanner.next();
            }
        }
        System.out.printf(String.format(Locale.US, "%.6f", result));
    }
}
