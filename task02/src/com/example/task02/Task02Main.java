package com.example.task02;

import java.io.*;

import static java.lang.System.in;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        //System.setIn(new FileInputStream("C:\\Users\\zxc ghoul\\IdeaProjects\\7-java-io\\task02\\src\\com\\example\\task02\\input.test"));

        //System.setOut(new PrintStream(new FileOutputStream("output.test")));

        int read = System.in.read();
        int next = System.in.read();
        while (read != -1){
            if (read != 13 || next != 10) {
                System.out.write(read);
            }
            read = next;
            next = System.in.read();
        }

        System.out.flush();
    }
}
