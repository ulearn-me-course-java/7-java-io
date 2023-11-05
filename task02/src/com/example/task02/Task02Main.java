package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        int current = System.in.read();
        while(current != -1){
            int next = System.in.read();
            if(current == 13 && next == 10){
                System.out.write(10);
                current = System.in.read();
                continue;
            }
            System.out.write(current);
            current = next;
        }
        System.out.flush();
        //пример для работы с файлом:
        //readLines(new FileReader("task02/src/com/example/task02/input.test"),
        //        new FileWriter("task02/src/com/example/task02/output.test"));
    }

    public static void readLines(Reader reader, Writer writer) throws IOException{
        int current = reader.read();
        while(current != -1){
            int next = reader.read();
            if(current == 13 && next == 10){
                writer.write(10);
                current = reader.read();
                continue;
            }
            writer.write(current);
            current = next;
        }
        writer.flush();
    }

}
