package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {

        int read = System.in.read();

        while (read > -1) {

            if (read == 13) {

                int temp = System.in.read();

                if (temp == 10) {
                    read = temp;
                }
                else if (temp == -1) {
                    System.out.write(read);
                    break;
                }
                else {
                    System.out.write(read);
                    read = temp;
                }
            }
            else {
                System.out.write(read);
                read = System.in.read();
            }
        }
        System.out.flush();

        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
    }
}
