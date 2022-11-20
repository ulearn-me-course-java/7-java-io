package com.example.task02;

import java.io.*;
import java.nio.file.Files;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ConvertEnd(inputStream, outputStream);
    }

    public static void ConvertEnd(InputStream inputStream, OutputStream outputStream) throws IOException {

        if (inputStream == null) {
            throw new IllegalArgumentException();
        }

        int nextChar;
        int curChar = inputStream.read();
        while (curChar != -1) {
            nextChar = inputStream.read();
            if (!(curChar == 13 && nextChar == 10))
                outputStream.write(curChar);
            curChar = nextChar;
        }
        outputStream.flush();
    }
}