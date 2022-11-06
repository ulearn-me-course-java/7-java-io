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
        int next = System.in.read();
        while (current!=-1){
            if ((current !=13 || next!=10)){
                System.out.write(current);
            }
            current = next;
            next = System.in.read();
        }

        System.out.flush();
    }
}
