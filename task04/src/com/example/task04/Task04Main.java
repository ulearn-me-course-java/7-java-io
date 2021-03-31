package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        double sum = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String c;
        while ((c = bufferedReader.readLine()) != null){
            for(String e : c.split(" ")) {
                sum += parse(e);
            }
        }
        System.out.printf(Locale.ENGLISH, "%.6f", sum);
    }

    public static double parse(String num){
        double result;
        try {
            result = Double.parseDouble(num);
        } catch (Exception e){
            result = 0.0;
        }
        return result;
    }
}
