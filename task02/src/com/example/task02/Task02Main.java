package com.example.task02;

import java.io.IOException;


public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы
        // (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int readByte = System.in.read();
        int nextByte = System.in.read();
        while (readByte != -1) {
            if (readByte != 13 || nextByte != 10) {
                System.out.write(readByte);
            }
            readByte = nextByte;
            nextByte = System.in.read();
        }

        System.out.flush();
    }
}

/*
        int read = System.in.read();
        int next = System.in.read();
        while (read != -1) {
            if (read != 13 || next != 10) {
                System.out.write(read);
            }
            read = next;
            next = System.in.read();
        }

        System.out.flush();
 */