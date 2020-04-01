package com.example.task02;

import java.io.IOException;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        byte[] bytes = new byte[System.in.available()];
        System.in.read(bytes);
        System.out.append(new String(bytes).replaceAll("\r\n","\n"));
    }

   /* public static void replaceWindowsToUnix(){
        Scanner in = new Scanner(System.in).useDelimiter("\\z");
        if (in.hasNext()) {
            try {
                System.out.write(in.next().replaceAll("\r\n", "\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        in.close();
        System.out.flush();
    }*/
}
