package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        Convert(System.in, System.out);
    }
    public static OutputStream Convert(InputStream inputStream, OutputStream outputStream) throws IOException {
        int bufCur = inputStream.read();
        int bufNext;
        while (bufCur > -1){
            bufNext = inputStream.read();
            if (!(bufCur == 13 && bufNext == 10)){
                outputStream.write(bufCur);
            }
            bufCur = bufNext;
        }
        outputStream.flush();
        return outputStream;
    }
}
