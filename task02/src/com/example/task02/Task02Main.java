package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        InputStream inputStream = System.in;
        int current = inputStream.read();
        int next = inputStream.read();
        while (current > -1) {
            if (!(current == 13 && next == 10)) {
                System.out.write(current);
            }
            current = next;
            next = inputStream.read();
        }
        System.out.flush();
    }
}
