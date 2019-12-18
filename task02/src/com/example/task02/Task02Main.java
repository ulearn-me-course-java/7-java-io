package com.example.task02;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        windowsToUnixEOL();
    }

    public static void windowsToUnixEOL() throws IOException {
        try(Scanner sc = new Scanner(System.in).useDelimiter("\\z")) {
            if (sc.hasNext()) {
                out.write(sc.next().replaceAll("\r\n", "\n").getBytes());
            }
            sc.close();
        }
        System.out.flush();
    }
}
