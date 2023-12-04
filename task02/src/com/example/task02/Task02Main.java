package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        byte[] temp = new byte[] {-1, -1};

        while (System.in.read(temp, 1, 1) != -1) {
            if(temp[0] != -1 && !(temp[0] == 13 && temp[1] == 10)){
                System.out.write(temp[0]);
            }
            temp[0] = temp[1];
        }
        if(temp[0] != -1){
            System.out.write(temp[0]);
        }

    }
}
