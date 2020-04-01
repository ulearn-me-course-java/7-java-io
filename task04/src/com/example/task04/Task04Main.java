package com.example.task04;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); //входной поток данных
        double sum = 0;
        while (scanner.hasNext()) { //пока в сканнере есть слова
            sum += tryParseDouble(scanner.next()); //в сумму добавляется число(после строки)
        }
        System.out.append(String.format("%.6f", sum).replace(",", ".")); //обновляет значение объекта, добавление
    }

    private static double tryParseDouble(String str) {
        double sum;
        try {
            sum = Double.parseDouble(str); //преобразует строку в число типа Double
        }
        catch (Exception ex) {
            return 0.0;
        }
        return sum;
    }
}