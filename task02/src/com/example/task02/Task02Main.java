package com.example.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        switchToUnix(System.in);
    }

    public static void switchToUnix(InputStream inputStream) throws IOException {
        String line = "";
        int chr;
        while((chr = inputStream.read()) != -1)
            line += (char) chr;
        System.out.print(line.replaceAll("\r\n", "\n"));
    }
}
