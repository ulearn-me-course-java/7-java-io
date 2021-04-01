package com.example.task04;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();

            } else {
                scanner.next();
            }
        }

        System.out.println(BigDecimal.valueOf(sum).setScale(6, BigDecimal.ROUND_HALF_UP));
    }
}
