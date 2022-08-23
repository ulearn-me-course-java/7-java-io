package com.example.task02;

import javafx.concurrent.Task;

import java.io.*;
import java.nio.file.Files;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = in;
        int previousRead = inputStream.read();
        int read = 0;
        while (previousRead >= 0) {
            read = inputStream.read();
            if (!(read == 10 && previousRead == 13))
                out.write(previousRead);
            previousRead = read;
        }
            out.flush();
    }
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
}

