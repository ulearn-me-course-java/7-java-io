package com.example.task02;

import java.io.IOException;
import java.util.Arrays;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        if (System.in.available() != 0) {
            int[] output = new int[System.in.available()];
            output[0] = System.in.read();
            int current = -1;
            int resultedLength = 0;
            for (int c = 1; (current = System.in.read()) > -1; c++) {
                if (output[c - 1] == 13 && current == 10) {
                    output[--c] = current;
                } else {
                    output[c] = current;
                }
                resultedLength = c;
            }

            output = Arrays.copyOf(output, ++resultedLength);
            for (int c = 0; c < output.length; c++) {
                System.out.write(output[c]);
            }
            System.out.flush();
        }
    }
}
