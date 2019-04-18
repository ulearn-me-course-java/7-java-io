package com.example.task02;

import java.io.IOException;
import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        InputStreamReader reader = new InputStreamReader(System.in);
        int symbol;
        int nextSymbol;

        symbol = reader.read();
        while ((nextSymbol = reader.read()) != -1) {
            if (!(symbol == 13 && nextSymbol == 10)) {
                System.out.print((char) symbol);
            }
            symbol = nextSymbol;
        }

        if (symbol != -1){
            System.out.print((char) symbol);
        }
    }
}
