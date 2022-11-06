package com.example.task02;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        InputStream is = System.in;
        if (is == null) throw new IllegalArgumentException();
        int prev = is.read();
        int current = is.read();
        while(prev != -1){
            if ((prev != 13 || current != 10)){
                System.out.write(prev);
            }
            prev = current;
            current = is.read();
        }
        System.out.flush();
    }
}
