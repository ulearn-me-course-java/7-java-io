package com.example.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int symbol;
        int previousSymbol = -1;

        while ((symbol = reader.read()) > -1) {
            if (previousSymbol == -1) {
                previousSymbol = symbol;
                continue;
            }

            if (!(previousSymbol == 13 && symbol == 10)) {
                System.out.print((char) previousSymbol);
            }

            previousSymbol = symbol;
        }

        if (previousSymbol != -1){
            System.out.print((char) previousSymbol);
        }
    }
}
