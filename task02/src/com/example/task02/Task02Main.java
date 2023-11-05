package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        InputStream in = System.in;
        PrintStream out = System.out;

        int first = in.read();

        while(first >= 0){
            if ((first == 13)) {
                int temp = in.read();
                if (temp == 10) {
                    out.write(temp);
                }
                else {
                    out.write(first);
                    first = temp;
                    continue;
                }
            }
            else {
                out.write(first);
            }
            first = in.read();
        }

        System.out.flush();
    }
}
