package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        int current = System.in.read();
        int previous = 0;

        int t = '\r';
        int n = '\n';

        while (current != -1) {
            switch (current){
                case '\n':
                    System.out.write(current);
                    break;
                case '\r':
                    if (previous == '\r')
                        System.out.write(previous);
                    break;
                default:
                    if (previous == '\r')
                        System.out.write(previous);
                    System.out.write(current);
                    break;
            }
            previous = current;
            current = System.in.read();
        }
        if (previous == '\r')
            System.out.write(previous);

        System.out.flush();
    }
}
