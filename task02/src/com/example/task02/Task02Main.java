package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        //InputStream inputStream = Files.newInputStream(Paths.get("task02/src/com/example/task02/input.test"));
        //OutputStream outputStream = Files.newOutputStream(Paths.get("task02/src/com/example/task02/output.test"));

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        int first = inputStream.read();
        int second = inputStream.read();
        while (first  > 0 ){
            if(first != 13 || second != 10){
                outputStream.write(first);
            }
            first = second;
            second = inputStream.read();
        }

        System.out.flush();
    }
}
