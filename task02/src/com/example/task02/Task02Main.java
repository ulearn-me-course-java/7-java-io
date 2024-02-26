package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        //InputStream in = Files.newInputStream(Paths.get("task02/src/com/example/task02/input.test"));
        //OutputStream out = Files.newOutputStream(Paths.get("task02/src/com/example/task02/output.test"));

        InputStream in = System.in;
        OutputStream out = System.out;
        int current = in.read();
        while(current > -1){
            int next = in.read();
            if (current == 13 && next == 10) {
                out.write(10);
                current = in.read();
                continue;
            }
            out.write(current);
            current = next;
        }
        out.flush();
    }
}
