package com.example.task04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    static boolean flag = true;
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        Scanner scanner = new Scanner(Files.newInputStream(Paths.get("task04/src/com/example/task04/input.test"))).useLocale(Locale.ENGLISH);
        double res = 0;
        while(scanner.hasNext()){
            if(scanner.hasNextDouble()){
                res+= scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf(Locale.ENGLISH,"%.6f",res);
    }
}
