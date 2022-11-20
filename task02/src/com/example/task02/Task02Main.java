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

        int now = inputStream.read();
        int next = inputStream.read();

        while (now != -1){
            if(next != 10 || now != 13){
                outputStream.write(now);
            }
            now = next;
            next = inputStream.read();
        }
        outputStream.flush();
    }
}
