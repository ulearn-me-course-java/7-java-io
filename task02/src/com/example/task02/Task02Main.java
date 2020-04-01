package com.example.task02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        int n = System.in.read();
        while (n != -1) {
            if (n == 13){
                n = System.in.read();
                if(n == -1){
                    System.out.write(13);
                    System.out.flush();
                    break;
                }else {
                    if (n != 10) {
                        System.out.write(13);
                    }
                    if(n == 13) continue;
                }
            }
            System.out.write(n);
            n = System.in.read();
        }
        System.out.flush();
    }
}
