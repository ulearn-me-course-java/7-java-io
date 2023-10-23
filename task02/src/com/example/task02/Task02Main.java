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
        if (inputStream == null) throw new IllegalArgumentException();
        int previousByte = inputStream.read();
        int currentByte = inputStream.read();
        while (previousByte != -1) {
            if (previousByte != 13 || currentByte != 10) {
                System.out.write(previousByte);
            }
            previousByte = currentByte;
            currentByte = inputStream.read();
        }
        System.out.flush();
    }
}
