package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        toUnixEOL();
    }

    public static void toUnixEOL() throws IOException {
        int[] readBytes = new int[2];
        readBytes[0] = System.in.read();
        readBytes[1] = System.in.read();

        while (readBytes[0] != -1) {
            if (readBytes[0] == 13 && readBytes[1] == 10) {
                System.out.write(10);
                readBytes[0] = System.in.read();
                readBytes[1] = System.in.read();
            } else {
                System.out.write(readBytes[0]);
                readBytes[0] = readBytes[1];
                readBytes[1] = System.in.read();
            }
        }
        System.out.flush();
    }
}
