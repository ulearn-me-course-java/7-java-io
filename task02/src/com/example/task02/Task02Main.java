package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        int previous = inputStream.read();
        int actual = inputStream.read();

        while (previous > -1) {
            if(!(previous == 13 && actual == 10)) {
                outputStream.write(previous);
            }
            previous = actual;
            actual = inputStream.read();
        }
        outputStream.flush();
    }
}
