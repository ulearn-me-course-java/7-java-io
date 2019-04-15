package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        Reader reader = new InputStreamReader(System.in);
        int first = reader.read();
        int second;
        while (first != -1) {
            try {
                second = reader.read();
                if (!(first == 13 && second == 10))
                    System.out.write(first);
                first = second;

            } catch (Exception e) {
                System.out.println("Введены неправильные значения.");
            }
        }
        System.out.flush();
    }

}
