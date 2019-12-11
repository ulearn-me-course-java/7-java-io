package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        w2u();
    }

    public static void w2u() throws IOException {
        int sym = -1;
        boolean prevT = false;
        while ((sym = System.in.read()) != -1) {
            if (sym == 10) {
                System.out.write(10);
                prevT = false;
            } else {
                if (prevT) {
                    System.out.write(13);
                    prevT = false;
                }
                if (sym != 13) {
                    System.out.write(sym);
                } else {
                    prevT = true;
                }
            }
        }
        if (prevT == true)
            System.out.write('\r');
    }
}
