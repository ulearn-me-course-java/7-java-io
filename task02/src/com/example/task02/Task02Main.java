package com.example.task02;

import java.io.*;
import java.io.IOException;


public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        File input = new File("task02\\src\\com\\example\\task02\\input.test");
        File output = new File("task02\\src\\com\\example\\task02\\output.test");
        File expected = new File("task02\\src\\com\\example\\task02\\expected.test");
        System.setIn(new FileInputStream(input));
        System.setOut(new PrintStream(new FileOutputStream(output)));

        int first = System.in.read();
        while (first != -1) {
            int second = System.in.read();
            if (first != 13 || second != 10) {
                System.out.write(first);
            }
            first = second;
        }

        System.out.flush();


    }
}
