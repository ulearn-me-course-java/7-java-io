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

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ConvertStream(inputStream, outputStream);

    }
    public static void ConvertStream(InputStream inputStream, OutputStream outputStream) throws IOException {


        if (inputStream == null) {
            throw new IllegalArgumentException();
        }
        int prevElem = inputStream.read();
        int curElem = inputStream.read();
        while(prevElem != -1){
            if ((prevElem != 13 || curElem != 10)){
                outputStream.write(prevElem);
            }
            prevElem = curElem;
            curElem = inputStream.read();
        }
        System.out.flush();


    }
}
