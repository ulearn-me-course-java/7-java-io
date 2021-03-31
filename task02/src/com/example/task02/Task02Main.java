package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы
        // (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        int currentInput, previousInput = System.in.read();
        while ((currentInput = System.in.read()) != -1) {
            if (!(currentInput == 10 && previousInput == 13)) System.out.write(previousInput);
            previousInput = currentInput;
        }
        if(previousInput!=-1) System.out.write(previousInput);
        System.out.flush();
    }
}
