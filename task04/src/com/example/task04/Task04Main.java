package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;


public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        if(System.in == null){
            throw new IllegalArgumentException();
        }
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double num = 0.0d;
        while(scanner.hasNext()) {
            try{
                num += Double.parseDouble(scanner.next());
            }catch (NumberFormatException ignored){}
        }
        System.out.printf(Locale.ENGLISH, "%.6f%n", num);
        //пример для работы с файлом:
        //System.out.printf(Locale.ENGLISH, "%.6f%n",
        //      readLines(Files.newInputStream(Paths.get("task04/src/com/example/task04/input.test"))));
    }

    public static double readLines(InputStream inputStream) throws IOException{
        if(inputStream == null){
            throw new IllegalArgumentException();
        }
        Scanner scanner = new Scanner(inputStream).useLocale(Locale.ENGLISH);
        double num = 0.0d;
        while(scanner.hasNext()) {
            try{
                num += Double.parseDouble(scanner.next());
            }catch (NumberFormatException ignored){}
        }
        return num;
    }
}
