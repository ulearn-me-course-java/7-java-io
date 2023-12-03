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
        InputStream input = System.in;
        OutputStream output = System.out;

        int previous = input.read();
        int current = input.read();

        while (previous != -1){
            if ((previous != 13 || current != 10)){
                output.write(previous);
            }
            previous = current;
            current = input.read();
        }

        System.out.flush();


    }
}
