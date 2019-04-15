package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        InputStreamReader reader = new InputStreamReader(System.in);
        int currentSymbol;
        int prevSymbol = -1;

        while ((currentSymbol = reader.read()) != -1) {
            if (!(prevSymbol == 13 && currentSymbol == 10) && prevSymbol != -1) {
                System.out.print((char) prevSymbol);
            }
            prevSymbol = currentSymbol;
        }

        if (prevSymbol != -1){
            System.out.print((char) prevSymbol);
        }
    }
}
