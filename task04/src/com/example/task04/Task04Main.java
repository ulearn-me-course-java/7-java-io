package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        /*
        Напишите программу, читающую текст из System.in и выводящую в System.out
        сумму всех встреченных в тексте вещественных чисел с точностью до шестого знака после запятой.
        Числом считается последовательность символов, отделенная от окружающего текста пробелами
        или переводами строк и успешно разбираемая методом Double.parseDouble.
         */

        double sum = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble())
                sum += scanner.nextDouble();
            else scanner.next();
        }

        System.out.printf(Locale.US, "%.6f", sum);
    }
}
