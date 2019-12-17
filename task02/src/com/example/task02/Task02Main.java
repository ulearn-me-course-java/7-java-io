package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        strFromWinToUnix();
    }

    public static void strFromWinToUnix() throws IOException {
        int current = System.in.read();
        while (current != -1) {
            int next = System.in.read();
            if (next == -1) {
                System.out.write(current);
            } else if (current == 13 && next == 10) {
                System.out.write(next);
                next = System.in.read();
            } else {
                System.out.write(current);
            }
            current = next;
        }
        System.out.flush();
    }
}
