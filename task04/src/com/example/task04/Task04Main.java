package com.example.task04;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        System.out.println(String.format("%.6f",sum(System.in)).replace(',','.'));
    }

    public static double sum(InputStream inputStream){
        Scanner sc = new Scanner(inputStream);

        double sum = 0.0d;

        while(sc.hasNext()){
            try{
                sum += Double.parseDouble(sc.next());
            }catch (Exception ignored) { }
        }

        return sum;
    }
}
